package davidch.leetcode.challenges.n1673;

public class Solution {


    public int[] mostCompetitive(int[] nums, int k) {
        final var result = new int[k];
        var resultIdx = 0;

        for (var i = 0; i < nums.length; i++) {
            while (resultIdx > 0 && result[resultIdx-1] > nums[i] && k - resultIdx < nums.length - i)
                resultIdx--;

            if (resultIdx < k) {
                result[resultIdx] = nums[i];
                resultIdx++;
            }
        }

        return result;
    }
}
