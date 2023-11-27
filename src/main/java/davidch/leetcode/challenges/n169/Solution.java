package davidch.leetcode.challenges.n169;

public class Solution {

    public int majorityElement(int[] nums) {
        var result = 0;
        var count = 0;
        for (var n : nums) {
            if (count == 0) result = n;
            if (result == n) count++;
            else count--;
        }
        return result;
    }
}
