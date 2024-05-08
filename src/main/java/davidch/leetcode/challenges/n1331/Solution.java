package davidch.leetcode.challenges.n1331;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        final var sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        final var rank = new HashMap<Integer, Integer>();
        var nextRank = 1;
        for (var n : sorted) {
            if (rank.containsKey(n)) continue;
            rank.put(n, nextRank);
            nextRank++;
        }

        for (var i = 0; i < arr.length; i++)
            arr[i] = rank.get(arr[i]);

        return arr;
    }
}
