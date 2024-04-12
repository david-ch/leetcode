package davidch.leetcode.challenges.n42;

public class Solution {
    public int trap(int[] height) {
        final var nextHighest = new int[height.length];
        nextHighest[nextHighest.length - 1] = 0;
        var highest = height[height.length - 1];
        for (var i = height.length - 2; i >= 0; i--) {
            nextHighest[i] = highest;
            highest = Math.max(highest, height[i]);
        }

        var result = 0;
        highest = 0;
        for (var i = 0; i < height.length; i++) {
            final var glassHeight = Math.min(highest, nextHighest[i]);
            if (glassHeight > height[i]) result += glassHeight - height[i];
            highest = Math.max(highest, height[i]);
        }

        return result;
    }
}
