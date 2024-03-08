package davidch.leetcode.challenges.n3005;

public class Solution {
    public int maxFrequencyElements(int[] nums) {
        final var counts = new int[101];
        var maxCount = 0;
        for (var n : nums) {
            counts[n]++;
            maxCount = Math.max(maxCount, counts[n]);
        }

        var result = 0;
        for (var cnt : counts)
            if (cnt == maxCount) result += maxCount;

        return result;
    }
}
