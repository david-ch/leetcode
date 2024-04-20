package davidch.leetcode.challenges.n1992;

import java.util.ArrayList;

public class Solution {
    public int[][] findFarmland(int[][] land) {
        final var result = new ArrayList<int[]>();

        for (var startI = 0; startI < land.length; startI++) {
            for (var startJ = 0; startJ < land[startI].length; startJ++) {
                if (land[startI][startJ] == 0) continue;

                var endI = startI;
                var endJ = startJ;
                while (endI < land.length - 1 && land[endI + 1][endJ] == 1) endI++;
                while (endJ < land[endI].length - 1 && land[endI][endJ + 1] == 1) endJ++;
                result.add(new int[]{startI, startJ, endI, endJ});

                for (var i = startI; i <= endI; i++)
                    for (var j = startJ; j <= endJ; j++)
                        land[i][j] = 0;
            }
        }

        return result.toArray(new int[][]{});
    }
}
