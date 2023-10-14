package davidch.leetcode.challenges.n1433;

public class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        final var s1Fingerprint = new int[26];
        final var s2Fingerprint = new int[26];
        final var len = s1.length();

        for (var i = 0; i < len; i++) {
            s1Fingerprint[s1.charAt(i) - 'a']++;
            s2Fingerprint[s2.charAt(i) - 'a']++;
        }

        var s1Diff = 0;
        var s2Diff = 0;
        for (var i = 0; i < 26; i++) {
            if (s1Diff >= 0) s1Diff += s1Fingerprint[i] - s2Fingerprint[i];
            if (s2Diff >= 0) s2Diff += s2Fingerprint[i] - s1Fingerprint[i];
            if (s1Diff < 0 && s2Diff < 0) return false;
        }

        return true;
    }
}
