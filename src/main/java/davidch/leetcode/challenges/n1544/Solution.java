package davidch.leetcode.challenges.n1544;

import java.util.Stack;

public class Solution {
    public String makeGood(String s) {
        final var stack = new Stack<Character>();
        final var len = s.length();

        for (var i = 0; i < len; i++) {
            final var ch = s.charAt(i);
            if (!stack.empty() && sameChar(stack.peek(), ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        final var result = new char[stack.size()];
        for (var i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);
    }

    private boolean sameChar(Character one, Character another) {
        return one != another && Character.toUpperCase(one) == Character.toUpperCase(another);
    }
}
