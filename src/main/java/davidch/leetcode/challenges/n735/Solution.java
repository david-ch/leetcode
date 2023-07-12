package davidch.leetcode.challenges.n735;

import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        final var prevAsts = new Stack<Integer>();

        for (var i = 0; i < asteroids.length; i++) {
            final var ast = asteroids[i];

            if (ast < 0) {
                int astdWeight = ast * -1;
                while (!prevAsts.empty() && prevAsts.peek() > 0 && prevAsts.peek() < astdWeight) {
                    prevAsts.pop();
                }

                if (!prevAsts.empty() && prevAsts.peek() > 0 && prevAsts.peek() >= astdWeight) {
                    if (prevAsts.peek() == astdWeight) prevAsts.pop();
                    continue;
                }
            }

            prevAsts.push(ast);
        }

        final var result = new int[prevAsts.size()];
        for (var i = result.length - 1; i >= 0; i--) {
            result[i] = prevAsts.pop();
        }

        return result;
    }
}
