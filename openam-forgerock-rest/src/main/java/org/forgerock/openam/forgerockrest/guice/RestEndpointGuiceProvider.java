/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2014 ForgeRock AS.
 */

package org.forgerock.openam.forgerockrest.guice;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.multibindings.MapBinder;
import com.sun.identity.shared.debug.Debug;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import org.forgerock.guice.core.InjectorHolder;
import org.forgerock.json.resource.CollectionResourceProvider;
import org.forgerock.json.resource.ConnectionFactory;
import org.forgerock.json.resource.Resources;
import org.forgerock.json.resource.SingletonResourceProvider;
import org.forgerock.openam.cts.utils.JSONSerialisation;
import org.forgerock.openam.forgerockrest.IdentityResource;
import org.forgerock.openam.forgerockrest.RealmResource;
import org.forgerock.openam.forgerockrest.authn.restlet.AuthenticationService;
import org.forgerock.openam.forgerockrest.cts.CoreTokenResource;
import org.forgerock.openam.forgerockrest.entitlements.ApplicationTypesResource;
import org.forgerock.openam.forgerockrest.entitlements.ApplicationsResource;
import org.forgerock.openam.forgerockrest.entitlements.ConditionTypesResource;
import org.forgerock.openam.forgerockrest.entitlements.DecisionCombinersResource;
import org.forgerock.openam.forgerockrest.entitlements.PolicyResource;
import org.forgerock.openam.forgerockrest.entitlements.SubjectTypesResource;
import org.forgerock.openam.forgerockrest.entitlements.wrappers.ApplicationManagerWrapper;
import org.forgerock.openam.forgerockrest.entitlements.wrappers.ApplicationTypeManagerWrapper;
import org.forgerock.openam.forgerockrest.server.ServerInfoResource;
import org.forgerock.openam.forgerockrest.session.SessionResource;
import org.forgerock.openam.forgerockrest.utils.MailServerLoader;
import org.forgerock.openam.rest.dashboard.DashboardResource;
import org.forgerock.openam.rest.resource.RealmRouterConnectionFactory;
import org.forgerock.openam.rest.router.CTSPersistentStoreProxy;
import org.forgerock.openam.rest.router.RestEndpointManager;
import org.restlet.resource.ServerResource;
import org.restlet.routing.Router;

/**
 * Contains all of Guice Providers for the Rest Endpoints.
 *
 * @since 12.0.0
 */
public final class RestEndpointGuiceProvider {

    /**
     * CREST Connection Factory Provider.
     *
     * @since 12.0.0
     */
    static class CrestRealmConnectionFactoryProvider implements javax.inject.Provider<ConnectionFactory> {

        private final RealmRouterConnectionFactory routerConnectionFactory;

        /**
         * Constructs a new instance of the CrestRealmConnectionFactoryProvider.
         *
         * @param routerConnectionFactory An instance of the RealmRouterConnectionFactory.
         */
        @Inject
        public CrestRealmConnectionFactoryProvider(final RealmRouterConnectionFactory routerConnectionFactory) {
            this.routerConnectionFactory = routerConnectionFactory;
        }

        /**
         * {@code}
         */
        @Override
        public ConnectionFactory get() {
            return Resources.newInternalConnectionFactory(routerConnectionFactory.realmRouter(""));
        }
    }

    /**
     * Restlet Endpoint Router Provider.
     *
     * @since 12.0.0
     */
    static class ServiceEndpointRouterProvider implements Provider<Router> {

        private final Map<String, ServiceProviderClass> serviceEndpoints;

        /**
         * Constructs a new instance of the ServiceEndpointRouterProvider.
         *
         * @param serviceEndpoints The Map of Service Endpoints.
         */
        @Inject
        public ServiceEndpointRouterProvider(final Map<String, ServiceProviderClass> serviceEndpoints) {
            this.serviceEndpoints = serviceEndpoints;
        }

        /**
         * {@inheritDoc}
         */
        @SuppressWarnings("unchecked")
        @Override
        public Router get() {

            Router router = new Router();

            for (Map.Entry<String, ServiceProviderClass> endpoint : serviceEndpoints.entrySet()) {
                router.attach(endpoint.getKey(), endpoint.getValue().getClazz());
            }

            return router;
        }
    }

    /**
     * Wrapper for Restlet ServiceProvider class.
     * <br/>
     * We do this wrapping so that Guice doesn't bind the Map of String, Class and prevents any other map of
     * this type being bound.
     *
     * @since 12.0.0
     */
    public static class ServiceProviderClass<T extends ServerResource> {

        private final Class<T> clazz;

        /**
         * Constructs a new instance of a ServiceProviderClass.
         *
         * @param clazz The actual ServiceProvider class.
         */
        public ServiceProviderClass(Class<T> clazz) {
            this.clazz = clazz;
        }

        /**
         * Gets the ServiceProvider class.
         *
         * @return The ServiceProvider class.
         */
        public Class<T> getClazz() {
            return clazz;
        }
    }

    /**
     * Binder for the Map of URI Template route to CollectionResourceProvider.
     *
     * @since 12.0.0
     */
    static class RestCollectionResourceEndpointsBinder {

        /**
         * Binds the Map of URI Template route to CollectionResourceProvider.
         *
         * @param binder The Guice Binder.
         * @return A bound Map of URI Template route to CollectionResourceProvider.
         */
        public static MapBinder<String, CollectionResourceProvider> newRestCollectionResourceEndpointBinder(
                final Binder binder) {

            MapBinder<String, CollectionResourceProvider> collectionResourceEndpoints = MapBinder.newMapBinder(binder,
                    String.class, CollectionResourceProvider.class);

            collectionResourceEndpoints.addBinding(RestEndpointManager.USERS).toProvider(new Provider<IdentityResource>() {
                public IdentityResource get() {
                    return new IdentityResource(
                            IdentityResource.USER_TYPE,
                            InjectorHolder.getInstance(MailServerLoader.class));
                }
            });
            collectionResourceEndpoints.addBinding(RestEndpointManager.GROUPS).toProvider(new Provider<IdentityResource>() {
                public IdentityResource get() {
                    return new IdentityResource(
                            IdentityResource.GROUP_TYPE,
                            InjectorHolder.getInstance(MailServerLoader.class));
                }
            });
            collectionResourceEndpoints.addBinding(RestEndpointManager.AGENTS).toProvider(new Provider<IdentityResource>() {
                public IdentityResource get() {
                    return new IdentityResource(
                            IdentityResource.AGENT_TYPE,
                            InjectorHolder.getInstance(MailServerLoader.class));
                }
            });
            collectionResourceEndpoints.addBinding(RestEndpointManager.APPLICATIONS)
                    .toProvider(ApplicationsResourceProvider.class);
            collectionResourceEndpoints.addBinding(RestEndpointManager.REALMS).to(RealmResource.class);
            collectionResourceEndpoints.addBinding(RestEndpointManager.DASHBOARD).to(DashboardResource.class);
            collectionResourceEndpoints.addBinding(RestEndpointManager.SESSIONS).to(SessionResource.class);
            collectionResourceEndpoints.addBinding(RestEndpointManager.TOKENS)
                    .toProvider(CoreTokenResourceProvider.class);
            collectionResourceEndpoints.addBinding(RestEndpointManager.SERVER_INFO).to(ServerInfoResource.class);
            collectionResourceEndpoints.addBinding(RestEndpointManager.POLICIES).to(PolicyResource.class);
            collectionResourceEndpoints.addBinding(RestEndpointManager.APPLICATIONTYPES).to(ApplicationTypesResource.class);
            collectionResourceEndpoints.addBinding(RestEndpointManager.CONDITIONTYPES).to(ConditionTypesResource.class);
            collectionResourceEndpoints.addBinding(RestEndpointManager.SUBJECTTYPES).to(SubjectTypesResource.class);
            collectionResourceEndpoints.addBinding(RestEndpointManager.DECISIONCOMBINERS).to(DecisionCombinersResource.class);


            return collectionResourceEndpoints;
        }
    }

    /**
     * Binder for the Map of URI Template route to SingletonResourceProvider.
     *
     * @since 12.0.0
     */
    static class RestSingletonResourceEndpointsBinder {

        /**
         * Binds the Map of URI Template route to SingletonResourceProvider.
         *
         * @param binder The Guice Binder.
         * @return A bound Map of URI Template route to SingletonResourceProvider.
         */
        public static MapBinder<String, SingletonResourceProvider> newRestSingletonResourceEndpointBinder(
                final Binder binder) {

            MapBinder<String, SingletonResourceProvider> singletonResourceEndpoints = MapBinder.newMapBinder(binder,
                    String.class, SingletonResourceProvider.class);

            return singletonResourceEndpoints;
        }
    }

    /**
     * Provider for the CoreTokenResourceProvider.
     *
     * @since 12.0.0
     */
    private static class CoreTokenResourceProvider implements Provider<CoreTokenResource> {

        private final JSONSerialisation jsonSerialisation;

        /**
         * Constructs an instance of the CoreTokenResourceProvider.
         *
         * @param jsonSerialisation An instance of the JSONSerialisation.
         */
        @Inject
        public CoreTokenResourceProvider(final JSONSerialisation jsonSerialisation) {
            this.jsonSerialisation = jsonSerialisation;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public CoreTokenResource get() {
            return new CoreTokenResource(jsonSerialisation, InjectorHolder.getInstance(CTSPersistentStoreProxy.class));
        }
    }

    /**
     * Provider for the ApplicationsResourceProvider.
     *
     * @since 12.0.0
     */
    private static class ApplicationsResourceProvider implements Provider<ApplicationsResource> {

        private final Debug debug;
        private final ApplicationManagerWrapper appManager;
        private final ApplicationTypeManagerWrapper appTypeManagerWrapper;

        /**
         * Constructs an instance of the ApplicationsResourceProvider.
         *
         * @param debug An instance of the debugger
         * @param appManager An instance of the application manager's instantiable wrapper
         */
        @Inject
        public ApplicationsResourceProvider(@Named("frRest")final Debug debug, ApplicationManagerWrapper appManager,
                                            ApplicationTypeManagerWrapper appTypeManagerWrapper) {
            this.debug = debug;
            this.appManager = appManager;
            this.appTypeManagerWrapper = appTypeManagerWrapper;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ApplicationsResource get() {
            return new ApplicationsResource(debug, appManager, appTypeManagerWrapper);
        }
    }


    /**
     * Binder for the Map of URI Template route to ServiceProvider class.
     *
     * @since 12.0.0
     */
    static class RestServiceEndpointsBinder {

        /**
         * Binds the Map of URI Template route to ServiceProvider class.
         *
         * @param binder The Guice Binder.
         * @return A bound Map of URI Template route to ServiceProvider class.
         */
        public static MapBinder<String, ServiceProviderClass> newRestServiceEndpointBinder(final Binder binder) {
            MapBinder<String, ServiceProviderClass> restServiceEndpoints = MapBinder.newMapBinder(binder, String.class,
                    ServiceProviderClass.class);

            restServiceEndpoints.addBinding(RestEndpointManager.AUTHENTICATE)
                    .toInstance(new ServiceProviderClass<AuthenticationService>(AuthenticationService.class));

            return restServiceEndpoints;
        }
    }
}