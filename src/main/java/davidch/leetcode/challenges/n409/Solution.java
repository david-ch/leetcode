package davidch.leetcode.challenges.n409;

public class Solution {
    public int longestPalindrome(String s) {
        final var pairPending = new boolean['z' - 'A' + 1];
        var result = 0;

        for (var ch : s.toCharArray()) {
            final var idx = ch - 'A';
            if (pairPending[idx]) {
                pairPending[idx] = false;
                result += 2;
            } else {
                pairPending[idx] = true;
            }
        }

        for (var p : pairPending) {
            if (p) {
                result++;
                break;
            }
        }

        return result;
    }
}
