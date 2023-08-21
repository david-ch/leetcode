package davidch.leetcode.challenges.n1926;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        final Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = 's';

        var level = 0;
        while (!queue.isEmpty()) {
            for (var levelSize = queue.size(); levelSize > 0; levelSize--) {
                final var cell = queue.poll();
                if (maze[cell[0]][cell[1]] != 's' && (cell[0] == 0 || cell[0] == maze.length - 1 || cell[1] == 0 || cell[1] == maze[0].length - 1))
                    return level;

                maze[cell[0]][cell[1]] = '+';

                if (cell[0] > 0 && maze[cell[0] - 1][cell[1]] == '.') {
                    maze[cell[0] - 1][cell[1]] = '+';
                    queue.offer(new int[]{cell[0] - 1, cell[1]});
                }

                if (cell[0] < maze.length - 1 && maze[cell[0] + 1][cell[1]] == '.') {
                    maze[cell[0] + 1][cell[1]] = '+';
                    queue.offer(new int[]{cell[0] + 1, cell[1]});
                }

                if (cell[1] > 0 && maze[cell[0]][cell[1] - 1] == '.') {
                    maze[cell[0]][cell[1] - 1] = '+';
                    queue.offer(new int[]{cell[0], cell[1] - 1});
                }

                if (cell[1] < maze[0].length - 1 && maze[cell[0]][cell[1] + 1] == '.') {
                    maze[cell[0]][cell[1] + 1] = '+';
                    queue.offer(new int[]{cell[0], cell[1] + 1});
                }
            }
            level++;
        }

        return -1;
    }
}
