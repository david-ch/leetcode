package davidch.leetcode.challenges.n645;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        var sum = 0;
        final var seen = new boolean[nums.length + 1];
        var duplicatedNum = -1;

        for (var n : nums) {
            if (duplicatedNum == -1) {
                if (seen[n]) duplicatedNum = n;
                else seen[n] = true;
            }
            sum += n;
        }

        sum -= duplicatedNum;
        final var targetSum = (nums.length + 1) * nums.length / 2;
        return new int[]{duplicatedNum, targetSum - sum};
    }
}
