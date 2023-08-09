package davidch.leetcode.challenges.n1557;

import java.util.*;

public class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        final var nonzeroIndegreeNodes = new boolean[n];
        for (var edge : edges) {
            nonzeroIndegreeNodes[edge.get(1)] = true;
        }

        final var result = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            if (!nonzeroIndegreeNodes[i]) result.add(i);
        }

        return result;
    }
}
