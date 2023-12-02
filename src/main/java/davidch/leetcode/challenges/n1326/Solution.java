package davidch.leetcode.challenges.n1326;

import java.util.Arrays;

public class Solution {

    public int minTaps(int n, int[] ranges) {
        final var taps = new Tap[ranges.length];
        for (var i = 0; i < ranges.length; i++)
            taps[i] = new Tap(
                    Math.max(0, i - ranges[i]),
                    Math.min(n, i + ranges[i])
            );

        Arrays.sort(taps);

        var tapIdx = 0;
        var areaIdx = 0;
        var tapsOpen = 0;
        while (tapIdx < taps.length && areaIdx < n) {
            Tap bestTap = null;
            while (tapIdx < taps.length && taps[tapIdx].from <= areaIdx) {
                if (taps[tapIdx].to > areaIdx && (bestTap == null || bestTap.to <= taps[tapIdx].to))
                    bestTap = taps[tapIdx];
                tapIdx++;
            }

            if (bestTap == null) return -1;
            areaIdx = bestTap.to;
            tapsOpen++;
        }

        return tapsOpen;
    }

    private record Tap(int from, int to) implements Comparable<Tap> {
        @Override
        public int compareTo(Tap o) {
            return from - o.from;
        }
    }
}
