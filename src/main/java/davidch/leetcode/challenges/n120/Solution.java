package davidch.leetcode.challenges.n120;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (var row = triangle.size() - 2; row >= 0; row--) {
            final var r = triangle.get(row);
            final var nextR = triangle.get(row + 1);
            final var rowLength = r.size();

            for (var col = 0; col < rowLength; col++)
                r.set(
                        col,
                        r.get(col) + Math.min(nextR.get(col), nextR.get(col + 1))
                );
        }

        return triangle.get(0).get(0);
    }
}
