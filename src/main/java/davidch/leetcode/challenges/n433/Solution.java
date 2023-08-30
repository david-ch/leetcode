package davidch.leetcode.challenges.n433;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int minMutation(String startGene, String endGene, String[] bank) {
        final var visited = new HashSet<String>();
        final Queue<String> q = new LinkedList<>();

        q.offer(startGene);
        visited.add(startGene);

        var level = 0;
        while (!q.isEmpty()) {
            for (var i = q.size(); i > 0; i--) {
                final var gene = q.poll();
                if (gene.equals(endGene)) return level;
                for (var nextGene : bank) {
                    if (visited.contains(nextGene)) continue;

                    var diffCharsNum = 0;
                    for (var c = 0; c < 8; c++)
                        if (gene.charAt(c) != nextGene.charAt(c)) diffCharsNum++;

                    if (diffCharsNum == 1) {
                        q.offer(nextGene);
                        visited.add(nextGene);
                    }
                }
            }

            level++;
        }

        return -1;
    }
}
