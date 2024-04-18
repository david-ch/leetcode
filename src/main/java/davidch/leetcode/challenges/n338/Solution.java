package davidch.leetcode.challenges.n338;

public class Solution {
    public int[] countBits(int n) {
        final var result = new int[n + 1];
        result[0] = 0;

        var i = 1;
        var copyI = 0;
        var copyTo = i;
        while (i <= n) {
            result[i] = 1 + result[copyI];
            i++;
            copyI++;
            if (copyI == copyTo) {
                copyI = 0;
                copyTo = i;
            }
        }

        return result;
    }
}
