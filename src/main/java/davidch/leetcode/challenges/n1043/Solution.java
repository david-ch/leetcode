package davidch.leetcode.challenges.n1043;

public class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        final var result = new int[arr.length];
        for (var right = 0; right < result.length; right++) {
            var windowMax = 0;
            for (var left = right; left >= Math.max(0, right - k + 1); left--) {
                windowMax = Math.max(windowMax, arr[left]);

                result[right] = Math.max(
                        result[right],
                        windowMax * (right - left + 1)
                                + (left == 0 ? 0 : result[left - 1])
                );
            }
        }

        return result[result.length - 1];
    }
}
