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

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ws.security.message.token.UsernameToken;
import org.forgerock.json.fluent.JsonValue;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNull;

public class AuthTargetMappingTest {
    private static final String USERNAME = "username";
    private static final String X509 = "X509";
    @Test
    public void testEquals() {
        AuthTargetMapping mapping1 = AuthTargetMapping
                .builder()
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME)
                .build();
        AuthTargetMapping mapping2 = AuthTargetMapping
                .builder()
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME)
                .build();
        assertEquals(mapping1, mapping2);
        assertEquals(USERNAME, mapping1.getAuthTargetMapping(UsernameToken.class).getAuthIndexValue());
        assertEquals(AMSTSConstants.AUTH_INDEX_TYPE_MODULE, mapping1.getAuthTargetMapping(UsernameToken.class).getAuthIndexType());


        AuthTargetMapping mapping3 = AuthTargetMapping
                .builder()
                .addMapping(TokenType.X509CERT, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, X509)
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME, buildContext())
                .build();
        AuthTargetMapping mapping4 = AuthTargetMapping
                .builder()
                .addMapping(TokenType.X509CERT, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, X509)
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME, buildContext())
                .build();
        assertEquals(mapping3, mapping4);
        assertEquals(X509, mapping3.getAuthTargetMapping(X509Certificate[].class).getAuthIndexValue());
        assertEquals(AMSTSConstants.AUTH_INDEX_TYPE_MODULE, mapping3.getAuthTargetMapping(UsernameToken.class).getAuthIndexType());

        AuthTargetMapping mapping5 = AuthTargetMapping
                .builder()
                .build();
        AuthTargetMapping mapping6 = AuthTargetMapping
                .builder()
                .build();
        assertEquals(mapping5, mapping6);
    }

    @Test
    public void testEqualsNot() {
        AuthTargetMapping mapping1 = AuthTargetMapping
                .builder()
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME)
                .build();
        AuthTargetMapping mapping2 = AuthTargetMapping
                .builder()
                .addMapping(TokenType.X509CERT, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, X509)
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME)
                .build();
        assertNotEquals(mapping1, mapping2);

        AuthTargetMapping mapping3 = AuthTargetMapping
                .builder()
                .build();
        AuthTargetMapping mapping4 = AuthTargetMapping
                .builder()
                .addMapping(TokenType.X509CERT, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, X509)
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME)
                .build();
        assertNotEquals(mapping3, mapping4);
    }

    @Test
    public void testLookup() {
        AuthTargetMapping mapping1 = AuthTargetMapping
                .builder()
                .addMapping(TokenType.X509CERT, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, X509)
                .build();
        AuthTargetMapping.AuthTarget at1 = new AuthTargetMapping.AuthTarget(AMSTSConstants.AUTH_INDEX_TYPE_MODULE, X509);
        assertEquals(mapping1.getAuthTargetMapping(X509Certificate[].class), at1);
        assertEquals(X509, mapping1.getAuthTargetMapping(X509Certificate[].class).getAuthIndexValue());
        assertEquals(AMSTSConstants.AUTH_INDEX_TYPE_MODULE, mapping1.getAuthTargetMapping(X509Certificate[].class).getAuthIndexType());

        AuthTargetMapping mapping2 = AuthTargetMapping
                .builder()
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME)
                .build();
        AuthTargetMapping.AuthTarget at2 = new AuthTargetMapping.AuthTarget(AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME);
        assertEquals(mapping2.getAuthTargetMapping(UsernameToken.class), at2);
        assertEquals(mapping2.getAuthTargetMapping(UsernameToken.class).getAuthIndexType(), at2.getAuthIndexType());
        assertEquals(mapping2.getAuthTargetMapping(UsernameToken.class).getAuthIndexValue(), at2.getAuthIndexValue());

        assertNull(mapping2.getAuthTargetMapping(String.class));

    }

    @Test
    public void testJsonRoundTrip() {
        AuthTargetMapping mapping = AuthTargetMapping
                .builder()
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME, buildContext())
                .addMapping(TokenType.X509CERT, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, X509)
                .build();
        assertEquals(mapping, AuthTargetMapping.fromJson(mapping.toJson()));
    }

    @Test
    public void testJsonStringRoundTrip() throws IOException {
        AuthTargetMapping mapping = AuthTargetMapping
                .builder()
                .addMapping(TokenType.X509CERT, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, X509)
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME, buildContext())
                .build();
        /*
        This is how the Crest HttpServletAdapter ultimately constitutes a JsonValue from a json string. See the
        org.forgerock.json.resource.servlet.HttpUtils.parseJsonBody (called from HttpServletAdapter.getJsonContent)
        for details. This is using the older version of jackson
        (org.codehaus.jackson.map.ObjectMapper), and I will do the same (albeit with the newer version), to reproduce
        the same behavior.
         */
        JsonParser parser = new ObjectMapper().getJsonFactory().createJsonParser(mapping.toJson().toString());
        final Object content = parser.readValueAs(Object.class);

        assertEquals(mapping, AuthTargetMapping.fromJson(new JsonValue(content)));
    }

    @Test
    public void testOlderJacksonJsonStringRoundTrip() throws IOException {
        AuthTargetMapping mapping = AuthTargetMapping
                .builder()
                .addMapping(TokenType.X509CERT, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, X509)
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME, buildContext())
                .build();
        /*
        This is how the Crest HttpServletAdapter ultimately constitutes a JsonValue from a json string. See the
        org.forgerock.json.resource.servlet.HttpUtils.parseJsonBody (called from HttpServletAdapter.getJsonContent)
        for details. This is using the older version of jackson
        (org.codehaus.jackson.map.ObjectMapper), and I will do the same, to reproduce
        the same behavior.
         */
        org.codehaus.jackson.JsonParser parser =
                new org.codehaus.jackson.map.ObjectMapper().getJsonFactory().createJsonParser(mapping.toJson().toString());
        final Object content = parser.readValueAs(Object.class);

        assertEquals(mapping, AuthTargetMapping.fromJson(new JsonValue(content)));
    }

    //TODO: more tests, also with context, when implemented
    @Test
    public void testAttributeMappingRoundTrip() {
        AuthTargetMapping mapping = AuthTargetMapping
                .builder()
                .addMapping(TokenType.X509CERT, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, X509)
                .addMapping(TokenType.USERNAME, AMSTSConstants.AUTH_INDEX_TYPE_MODULE, USERNAME)
                .build();
/*
        AuthTargetMapping.AuthTarget usernameTarget = mapping.getAuthTargetMapping(UsernameToken.class);
        System.out.println("usernameTarget: " + usernameTarget);
        AuthTargetMapping.AuthTarget x509Target = mapping.getAuthTargetMapping(X509Certificate[].class);
        System.out.println("x509Target: " + x509Target);

        AuthTargetMapping roundTripMapping = AuthTargetMapping.marshalFromAttributeMap(mapping.marshalToAttributeMap());
        usernameTarget = roundTripMapping.getAuthTargetMapping(UsernameToken.class);
        System.out.println("mapped usernameTarget: " + usernameTarget);
        x509Target = roundTripMapping.getAuthTargetMapping(X509Certificate[].class);
        System.out.println("mapped x509Target: " + x509Target);
*/
        assertEquals(mapping, AuthTargetMapping.marshalFromAttributeMap(mapping.marshalToAttributeMap()));
    }

    private Map<String, Object> buildContext() {
        Map<String, Object> context = new HashMap<String, Object>();
        context.put("bobo", "doh");
        return context;
    }
}
