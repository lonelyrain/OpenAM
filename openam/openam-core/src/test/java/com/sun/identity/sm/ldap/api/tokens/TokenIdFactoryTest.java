/**
 * Copyright 2013 ForgeRock, Inc.
 *
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
 */
package com.sun.identity.sm.ldap.api.tokens;

import com.iplanet.dpro.session.SessionID;
import com.sun.identity.sm.ldap.utils.KeyConversion;
import org.forgerock.json.fluent.JsonValue;
import org.mockito.BDDMockito;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * @author robert.wapshott@forgerock.com
 */
public class TokenIdFactoryTest {
    @Test
    public void shouldUseKeyConversionForSAMLTokens() {
        // Given
        String key = "badger";
        KeyConversion conversion = BDDMockito.mock(KeyConversion.class);
        TokenIdFactory factory = new TokenIdFactory(conversion);

        // When
        factory.toSAMLPrimaryTokenId(key);
        factory.toSAMLSecondaryTokenId(key);

        // Then
        verify(conversion, times(2)).encodeKey(key);
    }

    @Test
    public void shouldUseKeyConversionForSessionTokens() {
        // Given
        SessionID session = new SessionID("badger");
        KeyConversion conversion = BDDMockito.mock(KeyConversion.class);
        TokenIdFactory factory = new TokenIdFactory(conversion);

        // When
        factory.toSessionTokenId(session);

        // Then
        verify(conversion).encryptKey(session);
    }

    @Test
    public void shouldEncodeOAuthTokenIdWhenSet() {
        // Given
        String key = "badger";

        Map<String, Object> values = new HashMap<String, Object>();
        values.put(TokenIdFactory.ID, key);
        JsonValue value = new JsonValue(values);

        KeyConversion conversion = BDDMockito.mock(KeyConversion.class);
        TokenIdFactory factory = new TokenIdFactory(conversion);

        // When
        String result = factory.toOAuthTokenId(value);

        // Then
        assertEquals(result, key);
    }

    @Test
    public void shouldGenerateRandomIdWhenOAuthTokenIdNotSet() {
        // Given
        JsonValue value = new JsonValue(new HashMap<String, Object>());

        KeyConversion conversion = BDDMockito.mock(KeyConversion.class);
        TokenIdFactory factory = new TokenIdFactory(conversion);

        // When
        String result = factory.toOAuthTokenId(value);

        // Then
        assertNotNull(result);
    }
}