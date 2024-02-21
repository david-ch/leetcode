package davidch.leetcode.challenges.n201;

public class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        for (var i = 0; i < 32 && left != right; i++) {
            final var mask = ~(1 << i);
            left &= mask;
            right &= mask;
        }

        return left;
    }
}
