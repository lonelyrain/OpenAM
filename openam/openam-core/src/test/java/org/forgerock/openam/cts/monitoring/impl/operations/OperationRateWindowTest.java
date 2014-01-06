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
 * Copyright 2013 ForgeRock AS.
 */

package org.forgerock.openam.cts.monitoring.impl.operations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class OperationRateWindowTest {

    private static final long SAMPLE_RATE = 1000L;

    private OperationMonitor.Timer timer;

    @BeforeMethod
    public void setUp() {
        timer = mock(OperationMonitor.Timer.class);
    }

    private OperationRateWindow createRateWindow(final long sampleRate, final int windowSize) {
        return new OperationRateWindow(timer, windowSize, sampleRate);
    }

    private OperationRateWindow createRateWindow(final int windowSize) {
        return createRateWindow(SAMPLE_RATE, windowSize);
    }

    private long getNowTimestamp(final long sampleRate) {
        return sampleRate * 10;
    }

    @Test
    public void shouldAddRateToFirstWindowSlot() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(1);
        long timestamp = getNowTimestamp(SAMPLE_RATE);

        //When
        rateWindow.recalculate(timestamp);

        //Then
        assertEquals(rateWindow.getAverageRate(), 1D);
    }

    @Test (expectedExceptions = AssertionError.class)
    public void shouldThrowAssertionErrorWhenLatestTimestampBeforeCurrent() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(1);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 - SAMPLE_RATE;

        rateWindow.recalculate(timestamp1);

        //When
        rateWindow.recalculate(timestamp2);

        //Then
        fail();
    }

    @Test
    public void shouldNotUpdatePastRateIfBeforeWindowStart() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(1);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 - SAMPLE_RATE;

        rateWindow.recalculate(timestamp1);

        //When
        rateWindow.recalculate(timestamp2);

        //Then
        assertEquals(rateWindow.getMaxRate(), 0L);
    }

    @Test
    public void shouldUpdatePreviousRate() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(4);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 - SAMPLE_RATE;

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);

        //When
        rateWindow.recalculate(timestamp3);

        //Then
        assertEquals(rateWindow.getMaxRate(), 2L);
    }

    @Test
    public void shouldUpdatePreviousPreviousRate() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(4);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 + SAMPLE_RATE;
        long timestamp4 = timestamp2 - SAMPLE_RATE;

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp3);

        //When
        rateWindow.recalculate(timestamp4);

        //Then
        assertEquals(rateWindow.getMaxRate(), 2L);
    }

    @Test
    public void shouldAddRatesToSameWindowSlotWithSameTimestamp() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(1);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1;

        rateWindow.recalculate(timestamp1);

        //When
        rateWindow.recalculate(timestamp2);

        //Then
        assertEquals(rateWindow.getAverageRate(), 2D);
    }

    @Test
    public void shouldAddRatesToSameWindowSlotWithTimestampsAtEitherEndOfSampleRate() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(1);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE - 1;

        rateWindow.recalculate(timestamp1);

        //When
        rateWindow.recalculate(timestamp2);

        //Then
        assertEquals(rateWindow.getAverageRate(), 2D);
    }

    @Test
    public void shouldAddRatesToDifferentWindowSlots() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(1);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;

        rateWindow.recalculate(timestamp1);

        //When
        rateWindow.recalculate(timestamp2);

        //Then
        assertEquals(rateWindow.getAverageRate(), 1D);
    }

    @Test
    public void shouldAddRatesToDifferentWindowSlotsWithAnEmptySlotBetween() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(2);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + (SAMPLE_RATE * 2);

        rateWindow.recalculate(timestamp1);

        //When
        rateWindow.recalculate(timestamp2);

        //Then
        assertEquals(rateWindow.getAverageRate(), 0.5);
    }

    @Test
    public void shouldGetAverageRateWhenTimeIsPassedLatestIndex() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(2);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;

        given(timer.now()).willReturn(timestamp1 + (SAMPLE_RATE * 2));

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);

        //When
        double rate = rateWindow.getAverageRate();

        //Then
        assertEquals(rate, 1D);
    }

    @Test
    public void shouldGetAverageRateWhenTimeIsInLatestIndex() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(2);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;

        given(timer.now()).willReturn(timestamp1 + SAMPLE_RATE);

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);

        //When
        double rate = rateWindow.getAverageRate();

        //Then
        assertEquals(rate, 0.5D);
    }

    @Test
    public void shouldGetAverageRateWhenTimeIsJustInLatestIndex() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(2);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;

        given(timer.now()).willReturn(timestamp1 + (SAMPLE_RATE * 2) - 1);

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);

        //When
        double rate = rateWindow.getAverageRate();

        //Then
        assertEquals(rate, 0.5D);
    }

    @Test
    public void shouldGetMinRateWhenNoRateSet() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(2);

        //When
        long rate = rateWindow.getMinRate();

        //Then
        assertEquals(rate, 0L);
    }

    @Test
    public void shouldGetMinRate() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(3);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 + SAMPLE_RATE;

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);

        //When
        long rate = rateWindow.getMinRate();

        //Then
        assertEquals(rate, 1L);
    }

    @Test
    public void shouldGetMinRateWhenWindowMoves() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(2);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 + SAMPLE_RATE;

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);

        //When
        long rate = rateWindow.getMinRate();

        //Then
        assertEquals(rate, 2L);
    }

    @Test
    public void shouldGetMinRateWhenTimeHasPassedCurrentIndex() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(3);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;

        given(timer.now()).willReturn(timestamp1 + (SAMPLE_RATE * 2) - 1);

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);

        //When
        long rate = rateWindow.getMinRate();

        //Then
        assertEquals(rate, 1L);
    }

    @Test
    public void shouldGetMinRateEvenWhenWindowHasMovedUnderIt() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(4);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 + SAMPLE_RATE;
        long timestamp4 = timestamp3 + SAMPLE_RATE;

        given(timer.now()).willReturn(timestamp1 + (SAMPLE_RATE * 2) + 1);

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.getMinRate();
        rateWindow.recalculate(timestamp4);

        //When
        long rate = rateWindow.getMinRate();

        //Then
        assertEquals(rate, 1L);
    }

    @Test
    public void shouldGetMinRateEvenWhenWindowHasMovedTwiceUnderIt() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(4);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 + SAMPLE_RATE;
        long timestamp4 = timestamp3 + (SAMPLE_RATE * 2);

        given(timer.now()).willReturn(timestamp1 + (SAMPLE_RATE * 2) + 1);

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.getMinRate();
        rateWindow.recalculate(timestamp4);

        //When
        long rate = rateWindow.getMinRate();

        //Then
        assertEquals(rate, 0L);
    }

    @Test
    public void shouldGetMaxRateWhenNoRateSet() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(2);

        //When
        long rate = rateWindow.getMaxRate();

        //Then
        assertEquals(rate, 0L);
    }

    @Test
    public void shouldGetMaxRate() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(3);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 + SAMPLE_RATE;

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);

        //When
        long rate = rateWindow.getMaxRate();

        //Then
        assertEquals(rate, 4L);
    }

    @Test
    public void shouldGetMaxRateWhenWindowMoves() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(2);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 + SAMPLE_RATE;

        given(timer.now()).willReturn(timestamp1 + (SAMPLE_RATE * 2) + 1);

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);

        //When
        long rate = rateWindow.getMaxRate();

        //Then
        assertEquals(rate, 3L);
    }

    @Test
    public void shouldGetMaxRateWhenTimeHasPassedCurrentIndex() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(3);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 + SAMPLE_RATE;

        given(timer.now()).willReturn(timestamp1 + (SAMPLE_RATE * 3) - 1);

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);

        //When
        long rate = rateWindow.getMaxRate();

        //Then
        assertEquals(rate, 6L);
    }

    @Test
    public void shouldGetMaxRateEvenWhenWindowHasMovedUnderIt() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(2);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 + SAMPLE_RATE;
        long timestamp4 = timestamp3 + SAMPLE_RATE;

        given(timer.now()).willReturn(timestamp1 + (SAMPLE_RATE * 2) + 1);

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.getMaxRate();
        rateWindow.recalculate(timestamp4);

        //When
        long rate = rateWindow.getMaxRate();

        //Then
        assertEquals(rate, 3L);
    }

    @Test
    public void shouldGetMaxRateEvenWhenWindowHasMovedTwiceUnderIt() {

        //Given
        OperationRateWindow rateWindow = createRateWindow(4);
        long timestamp1 = getNowTimestamp(SAMPLE_RATE);
        long timestamp2 = timestamp1 + SAMPLE_RATE;
        long timestamp3 = timestamp2 + SAMPLE_RATE;
        long timestamp4 = timestamp3 + (SAMPLE_RATE * 2);

        given(timer.now()).willReturn(timestamp1 + (SAMPLE_RATE * 2) + 1);

        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp1);
        rateWindow.recalculate(timestamp2);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.recalculate(timestamp3);
        rateWindow.getMaxRate();
        rateWindow.recalculate(timestamp4);

        //When
        long rate = rateWindow.getMaxRate();

        //Then
        assertEquals(rate, 3L);
    }
}