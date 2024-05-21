package davidch.leetcode.challenges.n3144;

import java.util.Arrays;

public class Solution {
    public int minimumSubstringsInPartition(String s) {
        final var chars = s.toCharArray();
        final var result = new int[chars.length];
        Arrays.fill(result, Integer.MAX_VALUE);

        for (int to = 0; to < chars.length; to++){
            final var count = new int[26];
            for (int from = to; from >= 0; from--){
                count[chars[from] - 'a']++;
                if (allEqual(count)) result[to] = from > 0 ? Math.min(result[to], 1 + result[from - 1]) : 1;
            }
        }
        return result[result.length - 1];
    }

    private boolean allEqual(int[] counts) {
        var target = -1;
        for (int count : counts) {
            if (count == 0) continue;
            if (target == -1) target = count;
            if (count != target) return false;
        }
        return true;
    }
}
