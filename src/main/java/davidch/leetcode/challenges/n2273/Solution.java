package davidch.leetcode.challenges.n2273;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> removeAnagrams(String[] words) {
        final var result = new ArrayList<String>();

        var prevFootprint = new int[26];
        for (var str : words) {
            var footprint = footprint(str);
            if (!Arrays.equals(prevFootprint, footprint)) result.add(str);
            prevFootprint = footprint;
        }

        return result;
    }

    private int[] footprint(String str) {
        final var chars = str.toCharArray();
        final var footprint = new int[26];
        for (char aChar : chars) footprint[aChar - 'a']++;
        return footprint;
    }
}
