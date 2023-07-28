package davidch.leetcode.challenges.n567;

import java.util.Arrays;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        final var s1Len = s1.length();
        final var s2Len = s2.length();
        if (s2Len < s1Len) return false;

        final var s1Fingerprint = new int['z' - 'a' + 1];
        for (var i = 0; i < s1Len; i++) {
            s1Fingerprint[s1.charAt(i) - 'a']++;
        }

        final var s2Fingerprint = new int['z' - 'a' + 1];
        for (var i = 0; i < s1Len; i++) {
            s2Fingerprint[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1Fingerprint, s2Fingerprint)) return true;

        for (var i = s1Len; i < s2Len; i++) {
            s2Fingerprint[s2.charAt(i - s1Len) - 'a']--;
            s2Fingerprint[s2.charAt(i) - 'a']++;
            if (Arrays.equals(s1Fingerprint, s2Fingerprint)) return true;
        }

        return false;
    }
}
