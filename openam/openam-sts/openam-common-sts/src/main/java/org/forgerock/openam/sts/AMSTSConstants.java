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
 * information: "Portions Copyrighted [year] [name of copyright owner]".
 *
 * Copyright 2013-2014 ForgeRock AS. All rights reserved.
 */

package org.forgerock.openam.sts;

import org.apache.ws.security.WSConstants;

import javax.xml.namespace.QName;

public class AMSTSConstants {
    /*
    The namespace defined by the WS-Trust specification.
     */
    public static final String WS_TRUST_NAMESPACE = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/";

    /*
    These constants define the QNames referencing services and ports in wsdl documents which define the semantics and
    SecurityPolicy bindings of published STS instances.
     */
    public static final QName STS_SERVICE = new QName(WS_TRUST_NAMESPACE, "unprotected_sts_service");
    public static final QName STS_SERVICE_PORT = new QName(WS_TRUST_NAMESPACE, "unprotected_sts_service_port");
    public static final QName SYMMETRIC_UT_STS_SERVICE = new QName(WS_TRUST_NAMESPACE, "symmetric_ut_sts_service");
    public static final QName SYMMETRIC_UT_STS_SERVICE_PORT = new QName(WS_TRUST_NAMESPACE, "symmetric_ut_sts_service_port");
    public static final QName ASYMMETRIC_UT_STS_SERVICE = new QName(WS_TRUST_NAMESPACE, "asymmetric_ut_sts_service");
    public static final QName ASYMMETRIC_UT_STS_SERVICE_PORT = new QName(WS_TRUST_NAMESPACE, "asymmetric_ut_sts_service_port");
    public static final QName TRANSPORT_UT_STS_SERVICE = new QName(WS_TRUST_NAMESPACE, "transport_ut_sts_service");
    public static final QName TRANSPORT_UT_STS_SERVICE_PORT = new QName(WS_TRUST_NAMESPACE, "transport_ut_sts_service_port");
    public static final QName SYMMETRIC_ENDORSING_CERT_STS_SERVICE = new QName(WS_TRUST_NAMESPACE, "symmetric_endorsing_cert_sts_service");
    public static final QName SYMMETRIC_ENDORSING_CERT_STS_SERVICE_PORT = new QName(WS_TRUST_NAMESPACE, "symmetric_endorsing_cert_sts_service_port");

    /*
    These constants define some strings which are used to specify the type of STS instance to publish. This is
    a simple specification used only when consuming the STS-instance-publishing web-service in integration tests.
    These values will be replaced by more a more detailed specification of STS instance details and the associated
    configuration state. They are being kept around for ease of use in integration tests.
     */
    public static final String UNPROTECTED_BINDING = "unprotected_binding";
    public static final String SYMMETRIC_USERNAME_TOKEN_BINDING = "symmetric_username_token_binding";
    public static final String ASYMMETRIC_USERNAME_TOKEN_BINDING = "asymmetric_username_token_binding";
    public static final String TRANSPORT_USERNAME_TOKEN_BINDING = "transport_username_token_binding";
    public static final String SYMMETRIC_ENDORSING_CERT_BINDING = "symmetric_endorsing_cert_binding";

    /*
    Used in conjunction with com.google.inject.Names.named to distinguish e.g. a Provider of the token types for
    issue operations vs. the token types for validate operations. In each case a list<TokenType> is returned, and thus
    we need @Named with one of the values below for disambiguation.
     */
    public static final String TOKEN_ISSUE_OPERATION = "token_issue_operation";
    public static final String TOKEN_VALIDATE_OPERATION_STATUS = "token_validate_operation_status";
    public static final String TOKEN_RENEW_OPERATION = "token_renew_operation";

    /*
    Used in conjunction with a @Named annotation to inject a Map<String, Object> instance necessary for the CXF interceptor-set
     */
    public static final String STS_WEB_SERVICE_PROPERTIES = "sts_web_service_properties";

    /*
    The following values are used by the AMTokenValidator.
     */
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String ACCEPT = "Accept";
    public static final String APPLICATION_JSON = "application/json";
    public static final String COOKIE = "Cookie";
    public static final String EQUALS = "=";

    /*
    This constant defines the name of the OpenAM token, currently used in token validation requests;
     */
    public static final String AM_TOKEN_TYPE = "http://forgerock.org/token/type/OpenAM";

    /*
    The name of the DOM Element used to communicate a OpenAM session identifier in the SecurityToken
     */
    public static final String AM_SESSION_ID_ELEMENT_NAME="openamsessionid";

    /*
    The namespace of the DOM Element used to communicate a OpenAM session identifier in the SecurityToken
     */
    public static final String AM_SESSION_ID_ELEMENT_NAMESPACE="http://forgerock.org/token/type/OpenAM/openamsessionid";

    /*
    Used in conjunction with a @Named annotation to inject the realm string.
     */
    public static final String REALM = "am_realm";

    /*
    Used in conjunction with a @Named annotation to inject the AM rest authN uri element string.
     */
    public static final String REST_AUTHN_URI_ELEMENT = "am_rest_authn";

    /*
    Used in conjunction with a @Named annotation to inject the AM rest logout uri element string.
     */
    public static final String REST_LOGOUT_URI_ELEMENT = "am_rest_logout";

    /*
    Used in conjunction with a @Named annotation to inject the AM rest username from session id uri element string.
     */
    public static final String REST_ID_FROM_SESSION_URI_ELEMENT = "am_rest_id_from_session";

    /*
    Used in conjunction with a @Named annotation to inject the url string corresponding to the AM deployment.
     */
    public static final String AM_DEPLOYMENT_URL = "am_deployment_url";

    /*
    String passed to Debug.getInstance(String id).
     */
    public static final String SOAP_STS_DEBUG_ID = "am_soap_sts";

    /*
    String passed to Debug.getInstance(String id).
     */
    public static final String REST_STS_DEBUG_ID = "am_rest_sts";

    /*
    The sts.auth.*TokenValidator instances will be configured with state that allows the AuthenticationUriProvider to
    know the module/service/? to be consumed as defined in the com.sun.identity.authentication.AuthContext.IndexType inner-class.
    The AuthContext.IndexType uses old-school enums, based on strings, to define the set of possible auth index types (i.e. the
    types of authentication facilities that can be invoked). These values are passed to the REST authN context, and the strings
    must marshall to the enum values defined in AuthContext.IndexType. I cannot import this class directly, as this would pull
    a dependency on openam-core, so I will re-define the string values here, and reference them where needed in STS code.
     */
    public static final String AUTH_INDEX_TYPE_MODULE = "module_instance";

    /*
    The name of the key identifying the token type in the json blob representing a token
     */
    public static final String TOKEN_TYPE_KEY = "token_type";

    /*
    The json representation of a UsernameToken will have the following key identifying the username.
     */
    public static final String USERNAME_TOKEN_USERNAME = "username";

    /*
    The json representation of a UsernameToken will have the following key identifying the password.
     */
    public static final String USERNAME_TOKEN_PASSWORD = "password";

    /*
    The json representation of a AM Session will have the following key identifying the sessionId.
     */
    public static final String AM_SESSION_TOKEN_SESSION_ID = "session_id";

    /*
    Used in a @Named annotation provided to the TokenTranslateOperationImpl to specify the Map<String,String> instances
    used to define the set of supported token transformations. This set will ultimately come from the user.
     */
    public static final String REST_SUPPORTED_TOKEN_TRANSLATIONS = "rest_supported_token_translations";

    /*
    Used when creating the RestSTSInstanceConfig, to specify for which token transformation operations the interim OpenAM
    session (generated after successful validation), should be invalidated.
     */
    public static final boolean INVALIDATE_INTERIM_OPENAM_SESSION = true;

    /*
    Used to access the headers in restlet ClientResource instances
     */
    public static final String RESTLET_HEADER_KEY = "org.restlet.http.headers";

    /*
    the /json/users/?_action=idFromSession needs the iPDP value in a cookie with a name corresponding to the cookie name
    in the AM deployment.
     */
    public static final String AM_SESSION_COOKIE_NAME = "am_session_cookie_name";

    /*
    set to /json. In composing the authentication, idFromSession, or logout urls, the realm has to be between
     e.g. authenticate and /json.
     */
    public static final String AM_REST_AUTHN_JSON_ROOT = "am_rest_authn_json_root";


    public static final String ROOT_REALM = "/";

    /*
    Used for marshalling between byte[] and string representations. Does not seem to be defined anywhere in the pre 1.7 JDK.
     */
    public static final String UTF_8_CHARSET_ID = "UTF-8";
}