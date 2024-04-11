package davidch.leetcode.challenges.n402;

public class Solution {
    public String removeKdigits(String num, int k) {
        final var digits = num.toCharArray();
        final var result = new char[digits.length];
        var nextResultIdx = 0;

        for (var d: num.toCharArray()) {
            while (
                nextResultIdx > 0
                    && result[nextResultIdx - 1] > d
                    && k > 0) {
                nextResultIdx--;
                k--;
            }

            result[nextResultIdx] = d;
            nextResultIdx++;
        }

        var start = 0;
        while (start < nextResultIdx && result[start] == '0') start++;

        if (k > 0) nextResultIdx = Math.max(start, nextResultIdx - k);

        return start == nextResultIdx
            ? "0"
            : new String(result, start, nextResultIdx - start);
    }
}
