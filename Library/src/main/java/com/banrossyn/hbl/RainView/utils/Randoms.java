package com.banrossyn.hbl.RainView.utils;

import java.util.Random;

/**
 * Utils for {@link Random}.
 *
 * @author BanRossyn
 * @since 2022/06/23
 */

public class Randoms {

    private static Random random = new Random();

    public static void setSeed(long seed) {
        random.setSeed(seed);
    }

    public static float floatStandard() {
        return random.nextFloat();
    }

    public static float floatAround(float mean, float delta) {
        return floatInRange(mean - delta, mean + delta);
    }

    public static float floatInRange(float left, float right) {
        return left + (right - left) * random.nextFloat();
    }

    public static double positiveGaussian() {
        return Math.abs(random.nextGaussian());
    }
}
