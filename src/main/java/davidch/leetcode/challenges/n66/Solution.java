package davidch.leetcode.challenges.n66;

public class Solution {
    public int[] plusOne(int[] digits) {
        for (var i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) return digits;
            else digits[i] = 0;
        }

        final var result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
