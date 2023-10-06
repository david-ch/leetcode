package davidch.leetcode.challenges.n886;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        final var adj = new ArrayList<List<Integer>>();
        for (var i = 0; i <= n; i++) adj.add(new ArrayList<>());

        for (int[] dislike : dislikes) {
            adj.get(dislike[0]).add(dislike[1]);
            adj.get(dislike[1]).add(dislike[0]);
        }


        final var colors = new int[n + 1];
        for (var i = 0; i < n; i++) {
            if (colors[i] == 0) {
                final var canPaint = paint(adj, colors, i);
                if (!canPaint) return false;
            }
        }

        return true;
    }

    private boolean paint(List<List<Integer>> adj, int[] colors, int i) {
        final Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        colors[i] = 1;

        while (!q.isEmpty()) {
            final var current = q.poll();
            for (final var neighbor : adj.get(current)) {
                if (colors[neighbor] == 0) {
                    colors[neighbor] = colors[current] * -1;
                    q.add(neighbor);
                }
                else if (colors[neighbor] == colors[current]) {
                    return false;
                }
            }
        }

        return true;
    }
}
