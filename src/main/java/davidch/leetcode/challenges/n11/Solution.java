package davidch.leetcode.challenges.n11;

public class Solution {

    public int maxArea(int[] height) {
        var left = 0;
        var right = height.length - 1;
        var maxVolume = 0;

        while (left < right) {
            final var currentHeight = Math.min(height[left], height[right]);
            maxVolume = Math.max(maxVolume, currentHeight * (right - left));

            while (left < right && height[left] <= currentHeight) left++;
            while (left < right && height[right] <= currentHeight) right--;
        }

        return maxVolume;
    }
}
