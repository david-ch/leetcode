package davidch.leetcode.challenges.n907;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    private static final long MOD = (long) 1e9 + 7;

    public int sumSubarrayMins(int[] arr) {
        final var nextLeftLesserElementIdx = new int[arr.length];
        Arrays.fill(nextLeftLesserElementIdx, -1);

        final var stack = new Stack<Integer>();
        for (var i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
            if (!stack.isEmpty()) {
                nextLeftLesserElementIdx[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();

        var result = 0L;
        for (var i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) stack.pop();

            var nextRightLesserElement = stack.isEmpty() ? arr.length : stack.peek();
            var thisElemResult = ((long) (i - nextLeftLesserElementIdx[i]) * (nextRightLesserElement - i)) % MOD;
            thisElemResult = (thisElemResult * arr[i]) % MOD;
            result = (result + thisElemResult) % MOD;

            stack.push(i);
        }

        return (int) result;
    }
}
