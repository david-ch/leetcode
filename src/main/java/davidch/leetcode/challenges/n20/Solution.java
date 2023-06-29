package davidch.leetcode.challenges.n20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        final var openBrackets = new Stack<Character>();

        final var len = s.length();
        for (var i = 0; i < len; i++) {
            final var ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                openBrackets.push(ch);
            } else {
                final var expectedOpeningBracket = switch (ch) {
                    case ')' -> '(';
                    case ']' -> '[';
                    default -> '{';
                };

                if (openBrackets.empty() || expectedOpeningBracket != openBrackets.pop()) return false;
            }
        }

        return openBrackets.empty();
    }
}
