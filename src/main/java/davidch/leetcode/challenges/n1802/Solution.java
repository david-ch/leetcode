package davidch.leetcode.challenges.n1802;

public class Solution {
    public int maxValue(int n, int index, int maxSum) {
        final var rLen = n - index - 1;

        var left = 1;
        var right = maxSum;
        var result = -1;

        while (left <= right) {
            final var x = left + (right - left) / 2;

            final var rProgLen = Math.min(x - 1, rLen);
            final var lProgLen = Math.min(x - 1, index);

            final var rSum = (x + x - rProgLen - 1.) / 2 * rProgLen + (rLen - rProgLen);
            final var lSum = (x + x - lProgLen - 1.) / 2 * lProgLen + (index - lProgLen);

            final var sum = x + rSum + lSum;
            if (sum == maxSum) {
                result = x;
                break;
            }
            else if (sum > maxSum) right = x - 1;
            else {
                left = x + 1;
                result = Math.max(result, x);
            }
        }

        return result;
    }
}
