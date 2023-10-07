package davidch.leetcode.challenges.n994;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int orangesRotting(int[][] grid) {
        final Queue<Cell> q = new LinkedList<>();
        var freshOrangesNum = 0;

        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) q.add(new Cell(i, j));
                else if (grid[i][j] == 1) freshOrangesNum++;
            }
        }

        var minute = 0;
        while (!q.isEmpty() && freshOrangesNum > 0) {
            for (var o = q.size(); o > 0; o--) {
                final var orange = q.poll();

                if (orange.i > 0 && grid[orange.i - 1][orange.j] == 1) {
                    grid[orange.i - 1][orange.j] = 2;
                    q.offer(new Cell(orange.i - 1, orange.j));
                    freshOrangesNum--;
                }

                if (orange.i < grid.length - 1 && grid[orange.i + 1][orange.j] == 1) {
                    grid[orange.i + 1][orange.j] = 2;
                    q.offer(new Cell(orange.i + 1, orange.j));
                    freshOrangesNum--;
                }

                if (orange.j > 0 && grid[orange.i][orange.j - 1] == 1) {
                    grid[orange.i][orange.j - 1] = 2;
                    q.offer(new Cell(orange.i, orange.j - 1));
                    freshOrangesNum--;
                }

                if (orange.j < grid[orange.i].length - 1 && grid[orange.i][orange.j + 1] == 1) {
                    grid[orange.i][orange.j + 1] = 2;
                    q.offer(new Cell(orange.i, orange.j + 1));
                    freshOrangesNum--;
                }
            }

            minute++;
        }

        return freshOrangesNum == 0 ? minute : -1;
    }

    record Cell(int i, int j) {
    }
}
