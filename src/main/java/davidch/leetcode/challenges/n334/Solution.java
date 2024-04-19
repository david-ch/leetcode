package davidch.leetcode.challenges.n334;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        var min1 = Integer.MAX_VALUE;
        var min2 = Integer.MAX_VALUE;
        for (var n : nums) {
            if (n <= min1) min1 = n;
            else if (n <= min2) min2 = n;
            else return true;
        }
        return false;
    }
}
