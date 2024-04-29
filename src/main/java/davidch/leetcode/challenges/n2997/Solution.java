package davidch.leetcode.challenges.n2997;

public class Solution {
    public int minOperations(int[] nums, int k) {
        var sum = k;
        for (var n : nums) sum ^= n;

        var result = 0;
        while (sum > 0) {
            result += (sum % 2);
            sum >>= 1;
        }
        return result;
    }
}
