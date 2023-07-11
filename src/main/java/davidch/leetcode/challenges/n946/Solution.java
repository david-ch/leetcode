package davidch.leetcode.challenges.n946;

import java.util.Stack;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        final var stack = new Stack<Integer>();

        var pushedIdx = 0;
        for (var poppedIdx = 0; poppedIdx < popped.length; poppedIdx++) {
            while (stack.empty() || stack.peek() != popped[poppedIdx]) {
                if (pushedIdx == pushed.length) return false;
                stack.push(pushed[pushedIdx]);
                pushedIdx++;
            }

            stack.pop();
        }

        return stack.empty() && pushedIdx == pushed.length;
    }
}
