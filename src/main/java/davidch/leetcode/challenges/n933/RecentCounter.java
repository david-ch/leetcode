package davidch.leetcode.challenges.n933;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    private final Queue<Integer> recentCalls = new LinkedList<>();

    public int ping(int t) {
        while (!recentCalls.isEmpty() && recentCalls.peek() < (t - 3000)) {
            recentCalls.poll();
        }

        recentCalls.offer(t);
        return recentCalls.size();
    }
}
