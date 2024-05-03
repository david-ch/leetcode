package davidch.leetcode.challenges.n165;

public class Solution {
    public int compareVersion(String version1, String version2) {
        final var v1 = version1.split("\\.");
        final var v2 = version2.split("\\.");

        var i = 0;
        while (i < v1.length && i < v2.length) {
            final var i1 = Integer.parseInt(v1[i]);
            final var i2 = Integer.parseInt(v2[i]);
            if (i1 < i2) return -1;
            else if (i1 > i2) return 1;
            i++;
        }

        final var tail = i == v1.length ? v2 : v1;
        while (i < tail.length) {
            if (Integer.parseInt(tail[i]) != 0) return tail == v1 ? 1 : -1;
            i++;
        }

        return 0;
    }
}
