package davidch.leetcode.challenges.n542;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static final int NOT_VISITED = Integer.MAX_VALUE;

    public int[][] updateMatrix(int[][] mat) {
        final Queue<Coord> queue = new LinkedList<>();
        for (var i = 0; i < mat.length; i++) {
            for (var j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) queue.add(new Coord(i, j));
                else mat[i][j] = Integer.MAX_VALUE;
            }
        }

        while (!queue.isEmpty()) {
            final var start = queue.poll();

            var nextI = start.i + 1;
            if (nextI < mat.length && mat[nextI][start.j] == NOT_VISITED) {
                mat[nextI][start.j] = mat[start.i][start.j] + 1;
                queue.add(new Coord(nextI, start.j));
            }

            nextI = start.i - 1;
            if (nextI >= 0 && mat[nextI][start.j] == NOT_VISITED) {
                mat[nextI][start.j] = mat[start.i][start.j] + 1;
                queue.add(new Coord(nextI, start.j));
            }

            var nextJ = start.j + 1;
            if (nextJ < mat[start.i].length && mat[start.i][nextJ] == NOT_VISITED) {
                mat[start.i][nextJ] = mat[start.i][start.j] + 1;
                queue.add(new Coord(start.i, nextJ));
            }

            nextJ = start.j - 1;
            if (nextJ >= 0 && mat[start.i][nextJ] == NOT_VISITED) {
                mat[start.i][nextJ] = mat[start.i][start.j] + 1;
                queue.add(new Coord(start.i, nextJ));
            }
        }

        return mat;
    }

    private record Coord(int i, int j) {
    }
}
