package davidch.leetcode.challenges.n1249;

import java.util.Stack;

public class Solution {
    public String minRemoveToMakeValid(String s) {
        final var chars = s.toCharArray();
        final var result = new char[chars.length];
        var resultLen = 0;

        final var openParenthesesIdxes = new Stack<Integer>();

        for (final char ch : chars) {
            if (ch == ')')
                if (!openParenthesesIdxes.isEmpty()) openParenthesesIdxes.pop();
                else continue;
            else if (ch == '(') openParenthesesIdxes.push(resultLen);

            result[resultLen] = ch;
            resultLen++;
        }


        var resultStart = 0;
        while (!openParenthesesIdxes.isEmpty()) {
            var copyToIdx = resultLen - 1;
            for (var i = resultLen - 1; i >= 0; i--) {
                if (!openParenthesesIdxes.isEmpty() && openParenthesesIdxes.peek().equals(i)) {
                    openParenthesesIdxes.pop();
                    resultLen--;
                } else {
                    result[copyToIdx] = result[i];
                    resultStart = copyToIdx;
                    copyToIdx--;
                }
            }
        }

        return new String(result, resultStart, resultLen);
    }
}
