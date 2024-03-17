package davidch.leetcode.challenges.n57;

import java.util.ArrayList;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        final var result = new ArrayList<int[]>(intervals.length);

        for (var toAdd : intervals) {
            if (toAdd[0] > newInterval[0]) {
                var temp = toAdd;
                toAdd = newInterval;
                newInterval = temp;
            }

            if (result.isEmpty()) result.add(toAdd);
            else {
                final var lastAdded = result.get(result.size() - 1);

                if (lastAdded[1] < toAdd[1])
                    if (lastAdded[1] >= toAdd[0]) lastAdded[1] = toAdd[1];
                    else  result.add(toAdd);
            }
        }

        if (result.isEmpty()) result.add(newInterval);
        else {
            final var lastAdded = result.get(result.size() - 1);

            if (lastAdded[1] < newInterval[1])
                if (lastAdded[1] >= newInterval[0]) lastAdded[1] = newInterval[1];
                else  result.add(newInterval);
        }

        return result.toArray(new int[][]{});
    }
}
