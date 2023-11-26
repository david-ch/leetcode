package davidch.leetcode.challenges.n2136;

import java.util.Arrays;

public class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        final var plants = new Plant[plantTime.length];
        for (var i = 0; i < plants.length; i++)
            plants[i] = new Plant(plantTime[i], growTime[i]);

        Arrays.sort(plants, (p1, p2) -> p2.growTime - p1.growTime);

        var workday = 0;
        var result = 0;
        for (var plant : plants) {
            workday += plant.plantTime;
            result = Math.max(result, workday + plant.growTime);
        }

        return result;
    }

    private record Plant(int plantTime, int growTime) {
    }
}
