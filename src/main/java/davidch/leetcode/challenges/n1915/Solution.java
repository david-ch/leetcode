package davidch.leetcode.challenges.n1915;

import java.util.HashMap;

public class Solution {
    public long wonderfulSubstrings(String word) {
        final var freq = new HashMap<Integer, Integer>();
        freq.put(0, 1);

        var result = 0L;
        var mask = 0;
        for (var n : word.toCharArray()) {
            mask ^= 1 << (n - 'a');
            final var count = freq.getOrDefault(mask, 0);
            result += count;
            freq.put(mask, count + 1);

            for (int otherCh = 0; otherCh < 10; otherCh++)
                result += freq.getOrDefault(mask ^ (1 << otherCh), 0);
        }

        return result;
    }
}
