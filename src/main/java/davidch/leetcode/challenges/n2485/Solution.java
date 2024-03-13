package davidch.leetcode.challenges.n2485;

public class Solution {
    public int pivotInteger(int n) {
        var left = 1;
        var right = n;

        while (left <= right) {
            final var mid = (left + right) / 2;
            final var leftSum = (1 + mid) * mid / 2;
            final var rightSum = (mid + n) * (n - mid + 1) / 2;

            if (leftSum == rightSum) return mid;
            else if (leftSum < rightSum) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}
