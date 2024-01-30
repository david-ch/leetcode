package davidch.leetcode.challenges.n150;

import java.util.ArrayDeque;

public class Solution {
    public int evalRPN(String[] tokens) {
        final var stack = new ArrayDeque<Integer>();
        for (var token : tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> stack.push(-stack.pop() + stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> stack.push((int) (1.0 / stack.pop() * stack.pop()));
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
