package davidch.leetcode.challenges.n904;

public class Solution {

    public int totalFruit(int[] trees) {
        int longestStreak = 0;

        int streakStart = 0;
        int currentFruitStreakStart = 0;
        int secondFruitType = -1;

        for (int i = 1; i < trees.length; i++) {
            if (trees[i] == trees[i - 1]) continue;

            if (trees[i] != trees[streakStart] && trees[i] != secondFruitType) {
                longestStreak = Math.max(longestStreak, i - streakStart);
                streakStart = currentFruitStreakStart;
            }

            secondFruitType = trees[currentFruitStreakStart];
            currentFruitStreakStart = i;
        }

        longestStreak = Math.max(longestStreak, trees.length - streakStart);

        return longestStreak;
    }
}
