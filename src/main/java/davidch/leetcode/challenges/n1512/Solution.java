package davidch.leetcode.challenges.n1512;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        final var numbersCounts = new int[100];

        var result = 0;
        for (int num : nums) {
            final var number = num - 1;
            final var previousCount = numbersCounts[number];
            result += previousCount;
            numbersCounts[number] = previousCount + 1;
        }

        return result;
    }
}
