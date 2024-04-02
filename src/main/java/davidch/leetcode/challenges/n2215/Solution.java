package davidch.leetcode.challenges.n2215;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        final var fingerprint1 = new boolean[2001];
        final var fingerprint2 = new boolean[2001];

        for (var n : nums1) fingerprint1[n + 1000] = true;
        for (var n : nums2) fingerprint2[n + 1000] = true;

        final var uniqueInNums1 = new ArrayList<Integer>();
        final var uniqueInNums2 = new ArrayList<Integer>();
        for (var i = 0; i < fingerprint1.length; i++) {
            if (fingerprint1[i] && !fingerprint2[i]) uniqueInNums1.add(i - 1000);
            else if (!fingerprint1[i] && fingerprint2[i]) uniqueInNums2.add(i - 1000);
        }

        return List.of(uniqueInNums1, uniqueInNums2);
    }
}
