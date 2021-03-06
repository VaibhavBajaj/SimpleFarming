/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.simpleFarming.components;

import org.terasology.reflection.MappedContainer;
import org.terasology.utilities.random.FastRandom;
import org.terasology.utilities.random.Random;

@MappedContainer
public class TimeRange {
    /** Minimum bounds of variation. */
    public long minRandom = 0;

    /** Maximum bounds of variation. */
    public long maxRandom = 5000;

    /** The base number before random variation is applied. */
    public long fixed = 10000;

    /**
     * Return the total time or time range using the values stored in this instance. This will be random per call.
     */
    public long getTimeRange() {
        long total = fixed;
        Random random = new FastRandom();
        total += random.nextFloat(minRandom, maxRandom);
        return total;
    }
}
