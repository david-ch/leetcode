package davidch.leetcode.challenges.n1748;

public class Solution {
    public int sumOfUnique(int[] nums) {
        final var numbersCounts = new int[100];
        for (var i = 0; i < nums.length; i++) {
            numbersCounts[nums[i]]++;
        }

        var result = 0;
        for (var i = 0; i < numbersCounts.length; i++) {
            if (numbersCounts[i] == 1) result += i;
        }

        return result;
    }
}
