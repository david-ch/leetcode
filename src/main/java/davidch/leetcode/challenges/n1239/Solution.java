package davidch.leetcode.challenges.n1239;

import java.util.List;

public class Solution {
    public int maxLength(List<String> arr) {
        final var footprints = new int[arr.size()];
        for (var i = 0; i < arr.size(); i++)
            for (var ch : arr.get(i).toCharArray()) {
                final var newFootPrint = footprints[i] | (1 << (ch - 'a'));
                if (newFootPrint == footprints[i]) {
                    footprints[i] = -1;
                    break;
                }
                footprints[i] = newFootPrint;
            }

        return maxLength(arr, footprints, 0, 0);
    }

    private int maxLength(List<String> arr, int[] footprints, int i, int currentFootprint) {
        if (i >= footprints.length) return 0;

        if (footprints[i] == -1 || (currentFootprint | footprints[i]) != (currentFootprint ^ footprints[i]))
            return maxLength(arr, footprints, i + 1, currentFootprint);

        return Math.max(
                arr.get(i).length() + maxLength(arr, footprints, i + 1, currentFootprint | footprints[i]),
                maxLength(arr, footprints, i + 1, currentFootprint)
        );
    }

}
