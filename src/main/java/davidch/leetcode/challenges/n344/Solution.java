package davidch.leetcode.challenges.n344;

public class Solution {

    public void reverseString(char[] s) {
        final var mid = s.length / 2;

        for (var i = 0; i < mid; i++) {
            final var other = s.length - 1 - i;

            final var buf = s[i];
            s[i] = s[other];
            s[other] = buf;
        }
    }
}
