package davidch.leetcode.challenges.n1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var maxCandies = 0;
        for (var c : candies) maxCandies = Math.max(c, maxCandies);

        final var result = new ArrayList<Boolean>();
        for (var i = 0; i < candies.length; i++)
            result.add(candies[i] + extraCandies >= maxCandies);

        return result;
    }
}
