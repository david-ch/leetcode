package davidch.leetcode.challenges.n2864;

public class Solution {
    public String maximumOddBinaryNumber(String s) {
        final var chars = s.toCharArray();
        var ones = 0;
        for (var i = 0; i < chars.length; i++) {
            if (chars[i] == '1') ones++;
            chars[i] = '0';
        }

        chars[chars.length - 1] = '1';
        ones--;

        var idx = 0;
        while (ones > 0) {
            chars[idx] = '1';
            ones--;
            idx++;
        }

        return new String(chars);
    }
}
