package davidch.leetcode.challenges.n1941;

public class Solution {
    public boolean areOccurrencesEqual(String s) {
        final var charsCounts = new int[26];
        final var len = s.length();
        for (var i = 0; i < len; i ++) {
            charsCounts[s.charAt(i) - 'a']++;
        }

        final var requiredFrequency = charsCounts[s.charAt(0) - 'a'];
        for (var i = 0; i < charsCounts.length; i++) {
            if (charsCounts[i] != 0 && charsCounts[i] != requiredFrequency) return false;
        }

        return true;
    }
}
