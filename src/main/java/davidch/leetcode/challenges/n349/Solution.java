package davidch.leetcode.challenges.n349;

import java.util.HashSet;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        final var set1 = new HashSet<Integer>();
        for (var n : nums1) set1.add(n);

        final var result = new HashSet<Integer>();
        for (var n : nums2) if (set1.contains(n)) result.add(n);

        final var resultArr = new int[result.size()];
        var i = 0;
        for (var n : result) resultArr[i++] = n;

        return resultArr;
    }
}
