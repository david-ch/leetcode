package davidch.leetcode.challenges.n752;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Solution {
    public int openLock(String[] deadends, String target) {
        final var visited = new HashSet<Integer>();
        Stream.of(deadends).forEach(deadend -> visited.add(Integer.parseInt(deadend)));
        if (visited.contains(0)) return -1;

        final var targetInt = Integer.parseInt(target);

        final Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visited.add(0);

        var level = 0;
        while (!q.isEmpty()) {
            for (var i = q.size(); i > 0; i--) {
                final var state = q.poll();
                if (state == targetInt) return level;

                for (var wheel = 0; wheel <= 3; wheel++) {
                    final var multiplier = (int) Math.pow(10, 3 - wheel);
                    final var wheelValue = (state % (multiplier * 10)) / multiplier;
                    final var newState = state - wheelValue * multiplier;

                    final var wheelUpValue = wheelValue == 9 ? 0 : wheelValue + 1;
                    final var wheelUpState = newState + wheelUpValue * multiplier;
                    if (!visited.contains(wheelUpState)) {
                        q.offer(wheelUpState);
                        visited.add(wheelUpState);
                    }

                    final var wheelDownValue = wheelValue == 0 ? 9 : wheelValue - 1;
                    final var wheelDownState = newState + wheelDownValue * multiplier;
                    if (!visited.contains(wheelDownState)) {
                        q.offer(wheelDownState);
                        visited.add(wheelDownState);
                    }
                }
            }

            level++;
        }

        return -1;
    }
}
