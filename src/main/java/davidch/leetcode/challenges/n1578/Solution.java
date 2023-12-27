package davidch.leetcode.challenges.n1578;

public class Solution {
    public int minCost(String colors, int[] neededTime) {
        final var colorsArr = colors.toCharArray();
        var totalCost = 0;
        var streakStart = 0;
        var streakEnd = 1;

        while (streakEnd <= neededTime.length) {
            if (streakEnd == neededTime.length || colorsArr[streakEnd] != colorsArr[streakStart]) {
                var total = 0;
                var max = 0;
                for (var i = streakStart; i < streakEnd; i++) {
                    total += neededTime[i];
                    max = Math.max(max, neededTime[i]);
                }

                totalCost += total - max;
                streakStart = streakEnd;
            }

            streakEnd++;
        }

        return totalCost;
    }
}
