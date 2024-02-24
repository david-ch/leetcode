package davidch.leetcode.challenges.n2092;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Arrays.sort(meetings, (m1, m2) -> m1[2] - m2[2]);

        final int[] parent = new int[n];
        for (var i = 0; i < n; i++) parent[i] = i;

        parent[firstPerson] = 0;
        var currentMeetingTime = 0;

        final var simMeetingsParts = new ArrayList<Integer>();

        for (var meeting : meetings) {
            if (meeting[2] != currentMeetingTime) {
                for (var i : simMeetingsParts) {
                    var root = i;
                    while (parent[root] != root) root = parent[root];
                    if (root != 0) parent[i] = i;
                }
                currentMeetingTime = meeting[2];
                simMeetingsParts.clear();
            }

            while (parent[meeting[0]] != meeting[0]) meeting[0] = parent[meeting[0]];
            while (parent[meeting[1]] != meeting[1]) meeting[1] = parent[meeting[1]];

            if (meeting[0] > meeting[1]) parent[meeting[0]] = meeting[1];
            else parent[meeting[1]] = meeting[0];

            simMeetingsParts.add(meeting[0]);
            simMeetingsParts.add(meeting[1]);
        }

        for (var i : simMeetingsParts) {
            var root = i;
            while (parent[root] != root) root = parent[root];
            if (root != 0) parent[i] = i;
        }

        final var result = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            var root = i;
            while (parent[root] != root) root = parent[root];
            if (root == 0) result.add(i);
        }

        return result;
    }
}
