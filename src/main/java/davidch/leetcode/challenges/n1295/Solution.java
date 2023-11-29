package davidch.leetcode.challenges.n1295;

public class Solution {
    public int findNumbers(int[] nums) {
        var result = 0;
        for (var n : nums) result += (int) Math.log10(n) % 2;
        return result;
    }
}
