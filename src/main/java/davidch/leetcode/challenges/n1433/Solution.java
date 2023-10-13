package davidch.leetcode.challenges.n1433;

import java.util.Arrays;

public class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        final var s1chars = s1.toCharArray();
        final var s2chars = s2.toCharArray();
        Arrays.sort(s1chars);
        Arrays.sort(s2chars);

        var s1Breaks = true;
        var s2Breaks = true;

        final var last = s1chars.length - 1;
        for (var i = 0; i <= last; i++) {
            if (s1Breaks && s1chars[i] < s2chars[i]) s1Breaks = false;
            if (s2Breaks && s2chars[i] < s1chars[i]) s2Breaks = false;
            if (!s1Breaks && !s2Breaks) return false;
        }

        return true;
    }
}
