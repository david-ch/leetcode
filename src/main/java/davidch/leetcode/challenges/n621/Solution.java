package davidch.leetcode.challenges.n621;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        final var counts = new int['Z' - 'A' + 1];
        for (var task : tasks) counts[task - 'A']++;
        Arrays.sort(counts);

        var result = counts[counts.length - 1] * (n + 1) - n;
        var groups = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (var i = 0; i < counts[counts.length - 1] - 1; i++) groups.add(n);

        final var groupsToReturn = new ArrayList<Integer>();

        for (var i = counts.length - 2; i >= 0 && counts[i] > 0; i--) {

            while (!groups.isEmpty()) {
                final var group = groups.poll();
                if (group > 1) groupsToReturn.add(group - 1);
                counts[i]--;
                if (counts[i] == 0) break;
            }

            groups.addAll(groupsToReturn);
            groupsToReturn.clear();

            result += counts[i];
        }

        return result;
    }
}
