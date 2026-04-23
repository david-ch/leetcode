package davidch.leetcode.challenges.n84;

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        var result = 0;
        final var previousLargest = new Stack<Rect>();

        for (var i = 0; i < heights.length; i++) {
            var currentRectStart = i;
            while (!previousLargest.isEmpty() && heights[previousLargest.peek().end] > heights[i]) {
                final var prev = previousLargest.pop();
                currentRectStart = prev.start;
                result = Math.max(result, heights[prev.end] * (i - prev.start));
            }
            previousLargest.push(new Rect(currentRectStart, i));
        }

        while (!previousLargest.isEmpty()) {
            final var prev = previousLargest.pop();
            result = Math.max(result, heights[prev.end] * (heights.length - prev.start));
        }

        return result;
    }

    private record Rect(int start, int end) {
    }
}
