package davidch.leetcode.challenges.n151;

public class Solution {
    public String reverseWords(String s) {
        final var chars = s.toCharArray();
        final var result = new char[chars.length];
        var resultIdx = 0;

        var wordStart = -1;
        for (var i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                if (wordStart != -1) {
                    if (resultIdx > 0) {
                        result[resultIdx] = ' ';
                        resultIdx++;
                    }

                    for (var j = i + 1; j <= wordStart; j++) {
                        result[resultIdx] = chars[j];
                        resultIdx++;
                    }

                    wordStart = -1;
                }
            }
            else if (wordStart == -1) wordStart = i;
        }

        if (wordStart != -1) {
            if (resultIdx > 0) {
                result[resultIdx] = ' ';
                resultIdx++;
            }

            for (var j = 0; j <= wordStart; j++) {
                result[resultIdx] = chars[j];
                resultIdx++;
            }
        }

        return new String(result, 0, resultIdx);
    }
}
