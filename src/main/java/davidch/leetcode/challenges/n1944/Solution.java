package davidch.leetcode.challenges.n1944;

import java.util.Stack;

public class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        final var visibleHeights = new Stack<Integer>();
        final var result = new int[heights.length];

        for (var i = heights.length - 1; i >= 0; i--) {
            final var height = heights[i];

            var hiddenPeopleNum = 0;
            while (!visibleHeights.isEmpty() && visibleHeights.peek() <= height) {
                visibleHeights.pop();
                hiddenPeopleNum++;
            }

            result[i] = hiddenPeopleNum + (visibleHeights.isEmpty() ? 0 : 1);
            visibleHeights.push(height);
        }

        return result;
    }
}
