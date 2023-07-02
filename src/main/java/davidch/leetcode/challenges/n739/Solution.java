package davidch.leetcode.challenges.n739;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        final var increasingTemperaturesIndexes = new Stack<Integer>();
        final var answer = new int[temperatures.length];

        for (var i = temperatures.length - 1; i >= 0; i--) {
            while (!increasingTemperaturesIndexes.empty() && temperatures[increasingTemperaturesIndexes.peek()] <= temperatures[i]) {
                increasingTemperaturesIndexes.pop();
            }

            if (!increasingTemperaturesIndexes.empty()) {
                answer[i] = increasingTemperaturesIndexes.peek() - i;
            }
            increasingTemperaturesIndexes.push(i);
        }

        return answer;
    }
}
