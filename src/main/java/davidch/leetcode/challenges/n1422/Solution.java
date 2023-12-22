package davidch.leetcode.challenges.n1422;

public class Solution {
    public int maxScore(String s) {
        var ones = 0;
        for (var ch : s.toCharArray())
            if (ch == '1') ones++;

        var result = 0;
        var zeroes = 0;
        final var len = s.length() - 1;
        for (var i = 0; i < len; i++) {
            if (s.charAt(i) == '0') zeroes++;
            else ones--;
            result = Math.max(result, ones + zeroes);
        }

        return result;
    }
}
