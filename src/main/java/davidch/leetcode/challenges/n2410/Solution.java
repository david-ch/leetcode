package davidch.leetcode.challenges.n2410;

import java.util.Arrays;

public class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        var playerIdx = 0;
        var trainerIdx = 0;
        var matchings = 0;

        while (playerIdx < players.length && trainerIdx < trainers.length) {
            if (players[playerIdx] <= trainers[trainerIdx]) {
                matchings++;
                playerIdx++;
            }
            trainerIdx++;
        }

        return matchings;
    }
}
