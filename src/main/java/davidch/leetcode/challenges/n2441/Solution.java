package davidch.leetcode.challenges.n2441;

public class Solution {

    public int findMaxK(int[] nums) {
        final var exists = new boolean[1001];
        var result = -1;

        for (var n : nums)
            if (n > 0) exists[n] = true;

        for (var n : nums)
            if (n < 0 && exists[-n])
                result = Math.max(result, -n);

        return result;
    }
}
