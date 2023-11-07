package davidch.leetcode.challenges.n1710;

import java.util.Arrays;

public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        var result = 0;
        var idx = 0;
        while (idx < boxTypes.length && truckSize > 0) {
            var boxesToAdd = Math.min(boxTypes[idx][0], truckSize);
            result += boxesToAdd * boxTypes[idx][1];
            truckSize -= boxesToAdd;
            idx++;
        }
        return result;
    }
}
