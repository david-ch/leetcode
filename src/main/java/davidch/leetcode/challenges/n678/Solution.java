package davidch.leetcode.challenges.n678;

import java.util.Stack;

public class Solution {
    public boolean checkValidString(String s) {
        final var stars = new Stack<Integer>();
        final var opens = new Stack<Integer>();

        final var chars = s.toCharArray();

        for (var i = 0; i < chars.length; i++) {
            final var ch = chars[i];

            if (ch == '(') opens.push(i);
            else if (ch == ')') {
                if (!opens.isEmpty()) opens.pop();
                else if (!stars.isEmpty()) stars.pop();
                else return false;
            } else stars.push(i);
        }

        while (!opens.isEmpty()) {
            final var open = opens.pop();
            if (stars.isEmpty() || stars.peek() < open) return false;
            stars.pop();
        }

        return true;
    }
}
