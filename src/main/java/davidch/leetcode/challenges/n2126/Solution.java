package davidch.leetcode.challenges.n2126;

import java.util.Arrays;

public class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        final var heaviestAsteroid = asteroids[asteroids.length - 1];

        for (var i = 0; i < asteroids.length; i++) {
            if (mass < asteroids[i]) return false;
            mass += asteroids[i];
            if (mass >= heaviestAsteroid) return true;
        }

        return true;
    }
}
