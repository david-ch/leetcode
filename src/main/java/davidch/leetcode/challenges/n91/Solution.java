package davidch.leetcode.challenges.n91;

import java.util.Arrays;

public class Solution {
    public int numDecodings(String s) {
        final var memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return numDecodings(s.toCharArray(), 0, memo);
    }

    public int numDecodings(char[] s, int i, int[] memo) {
        if (i == s.length) return 1;
        if (s[i] == '0') return 0;
        if (i == s.length - 1) return 1;

        if (memo[i] == -1) {
            final var canParseTwoDigits = i < s.length - 1
                    && (s[i] == '1' || (s[i] == '2' && s[i + 1] < '7'));
            memo[i] = numDecodings(s, i + 1, memo)
                    + (canParseTwoDigits ? numDecodings(s, i + 2, memo) : 0);
        }

        return memo[i];
    }
}
