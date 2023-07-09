package davidch.leetcode.challenges.n2390;

import java.util.Arrays;

public class Solution {
    public String removeStars(String s) {
        final var len = s.length();

        var result = new char[len];
        var resultIdx = 0;

        var charsToSkip = 0;
        for (var i = len - 1; i >= 0; i--) {
            final var ch = s.charAt(i);

            if (ch == '*') charsToSkip++;
            else if (charsToSkip > 0) charsToSkip--;
            else {
                result[resultIdx] = ch;
                resultIdx++;
            }
        }

        result = Arrays.copyOfRange(result, 0, resultIdx);
        final var resultLen = result.length;
        final var resultMid = resultLen / 2;
        for (var i = 0; i < resultMid; i++) {
            final var otherIdx = resultLen - i - 1;

            final var buf = result[i];
            result[i] = result[otherIdx];
            result[otherIdx] = buf;
        }

        return new String(result);
    }
}
