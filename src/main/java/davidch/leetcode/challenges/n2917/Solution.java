package davidch.leetcode.challenges.n2917;

public class Solution {
    public int findKOr(int[] nums, int k) {
        final var bits = new int[32];
        for (int num : nums) {
            var test = 1;
            for (var bit = 0; bit < bits.length; bit++) {
                if ((num & test) > 0) bits[bit]++;
                test <<= 1;
            }
        }

        var result = 0;
        var set = 1;
        for (int i : bits) {
            if (i >= k) result |= set;
            set <<= 1;
        }

        return result;
    }
}
