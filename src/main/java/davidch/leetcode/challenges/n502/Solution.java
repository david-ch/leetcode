package davidch.leetcode.challenges.n502;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        final var projects = new Project[profits.length];
        for (var i = 0; i < profits.length; i++)
            projects[i] = new Project(profits[i], capital[i]);

        Arrays.sort(projects, Comparator.comparing(p -> p.capital));

        final var maxProfitHeap = new PriorityQueue<Integer>(profits.length, Comparator.reverseOrder());

        var projectsIdx = 0;
        while (k > 0) {
            while (projectsIdx < projects.length && projects[projectsIdx].capital <= w)
                maxProfitHeap.offer(projects[projectsIdx++].profit);

            if (maxProfitHeap.isEmpty()) break;
            w += maxProfitHeap.poll();
            k--;
        }

        return w;
    }

    private record Project(int profit, int capital) {
    }
}
