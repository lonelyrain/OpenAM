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

/**
 * This class maintains a cumulative count and rate for a CTS operation.
 *
 * @since 12.0.0
 */
class OperationMonitor {

    private static final long SAMPLE_RATE = 1000L;
    private static final int WINDOW_SIZE = 10;

    private final Timer timerGetter;
    private final OperationRateWindow rateWindow;

    private long count = 0;

    /**
     * Constructs a new instance of the OperationMonitor.
     */
    public OperationMonitor() {
        this(new Timer());
    }

    /**
     * Constructs a new instance of the OperationMonitor.
     *
     * @param timer An instance of a Timer.
     */
    private OperationMonitor(final Timer timer) {
        this(timer, new OperationRateWindow(timer, WINDOW_SIZE, SAMPLE_RATE));
    }

    /**
     * Constructs a new instance of the OperationMonitor, for test use.
     *
     * @param timer An instance of a Timer.
     */
    OperationMonitor(final Timer timer, final OperationRateWindow rateWindow) {
        this.timerGetter = timer;
        this.rateWindow = rateWindow;
    }

    /**
     * Increments the cumulative count for an operation and recalculates the rate at which the operation
     * has been made.
     * <br/>
     * Only synchronizes the count increment, NOT the whole method.
     */
    void increment() {
        synchronized (this) {
            count++;
        }
        rateWindow.recalculate(timerGetter.now());
    }
    /**
     * Returns the average rate at which an operation has been performed.
     *
     * @return The average rate at which an operation has been performed.
     */
    double getAverageRate() {
        return rateWindow.getAverageRate();
    }

    /**
     * Returns the minimum rate at which an operation has been performed.
     *
     * @return The minimum rate at which an operation has been performed.
     */
    long getMinRate() {
        return rateWindow.getMinRate();
    }

    /**
     * Returns the maximum rate at which an operation has been performed.
     *
     * @return The maximum rate at which an operation has been performed.
     */
    long getMaxRate() {
        return rateWindow.getMaxRate();
    }

    /**
     * Returns the cumulative count of an operation, since server start up.
     *
     * @return The cumulative count for an operation.
     */
    long getCount() {
        return count;
    }

    /**
     * Abstracts for the call to System.currentTimeMillis, to allow a test to mock out this call.
     */
    static class Timer {

        /**
         * Gets the current millis from the System.
         *
         * @return The current milliseconds.
         */
        long now() {
            return System.currentTimeMillis();
        }
    }
}
