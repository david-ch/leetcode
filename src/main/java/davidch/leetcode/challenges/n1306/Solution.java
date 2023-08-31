package davidch.leetcode.challenges.n1306;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean canReach(int[] arr, int start) {
        final var visited = new boolean[arr.length];
        final Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            final var i = q.poll();
            final var val = arr[i];
            if (val == 0) return true;

            final var stepBack = i - val;
            if (stepBack >= 0 && !visited[stepBack]) {
                q.offer(stepBack);
                visited[stepBack] = true;
            }

            final var stepForward = i + val;
            if (stepForward < arr.length && !visited[stepForward]) {
                q.offer(stepForward);
                visited[stepForward] = true;
            }
        }

        return false;
    }
}
