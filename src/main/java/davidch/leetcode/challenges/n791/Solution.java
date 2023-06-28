package davidch.leetcode.challenges.n791;

public class Solution {
    public String customSortString(String order, String s) {
        final var orderLen = order.length();
        final var orderCharsCounts = new byte[orderLen];

        final var stringLen = s.length();
        final var result = new char[stringLen];
        var resultIdx = 0;

        for (int i = 0; i < stringLen; i++) {
            final var ch = s.charAt(i);
            final var orderedCharIdx = order.indexOf(ch);
            if (orderedCharIdx == -1) {
                result[resultIdx++] = ch;
            } else {
                orderCharsCounts[orderedCharIdx]++;
            }
        }

        for (byte i = 0; i < orderLen; i++) {
            final var ch = order.charAt(i);
            for (byte j = 0; j < orderCharsCounts[i]; j++) {
                result[resultIdx] = ch;
                resultIdx++;
            }
        }

        return new String(result);
    }
}
