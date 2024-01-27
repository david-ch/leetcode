package davidch.leetcode.challenges.n771;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        var jewelsIndex = 0L;
        final var jewelsLen = jewels.length();
        for (var i = 0; i < jewelsLen; i++) {
            jewelsIndex |= 1L << jewels.charAt(i);
        }

        var result = 0;
        final var stonesLen = stones.length();
        for (var i = 0; i < stonesLen; i++) {
            if ((jewelsIndex & 1L << stones.charAt(i)) != 0) result++;
        }

        return result;
    }
}
