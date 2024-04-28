package davidch.leetcode.challenges.n506;

import java.util.Arrays;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        final var athletes = new Athlete[score.length];
        for (var i = 0; i < score.length; i++) athletes[i] = new Athlete(i, score[i]);
        Arrays.sort(athletes, (a1, a2) -> a2.score - a1.score);

        final var result = new String[score.length];
        for (var place = 0; place < athletes.length; place++) result[athletes[place].idx] = (place + 1) + "";

        result[athletes[0].idx] = "Gold Medal";
        if (athletes.length > 1) result[athletes[1].idx] = "Silver Medal";
        if (athletes.length > 2) result[athletes[2].idx] = "Bronze Medal";

        return result;
    }

    private record Athlete(int idx, int score) {
    }
}
