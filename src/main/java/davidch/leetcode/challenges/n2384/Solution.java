package davidch.leetcode.challenges.n2384;

public class Solution {

    public String largestPalindromic(String num) {
        final var digitsCount = new int[10];
        for (var c : num.toCharArray()) digitsCount[c - '0']++;

        final var result = new char[num.length()];
        var resultIdx = 0;
        for (var i = 9; i > 0; i--) {
            for (var c = 0; c < digitsCount[i] / 2; c++) {
                result[resultIdx] = (char) (i + '0');
                resultIdx++;
            }
        }

        if (resultIdx > 0) {
            for (var c = 0; c < digitsCount[0] / 2; c++) {
                result[resultIdx] = '0';
                resultIdx++;
            }
        }

        var centralElementAdded = false;
        for (var i = 9; i >= 0; i--) {
            if (digitsCount[i] % 2 == 1) {
                result[resultIdx] = (char) (i + '0');
                resultIdx++;
                centralElementAdded = true;
                break;
            }
        }

        if (resultIdx == 0) return "0";

        for (var i = resultIdx - (centralElementAdded ? 2 : 1); i >= 0; i--) {
            result[resultIdx] = result[i];
            resultIdx++;
        }

        return new String(result, 0, resultIdx);
    }
}
