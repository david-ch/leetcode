package davidch.leetcode.challenges.n1047;

import java.util.Stack;

public class Solution {
    public String removeDuplicates(String s) {
        final var stack = new Stack<Character>();

        final var len = s.length();
        for (var i = 0; i < len; i++) {
            final var ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek().equals(ch)) {
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
}
