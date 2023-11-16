package davidch.leetcode.challenges.n1663;

public class Solution {

    public static final int Z_POSITION = 'z' - 'a';

    public String getSmallestString(int n, int k) {
        final var result = new char[n];
        k -= n;

        for (var i = result.length - 1; i >= 0; i--) {
            final var nextCharPos = Math.min(k, Z_POSITION);
            k -= nextCharPos;
            result[i] = (char) ('a' + nextCharPos);
        }

        return new String(result);
    }
}
