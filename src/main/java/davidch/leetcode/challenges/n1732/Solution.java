package davidch.leetcode.challenges.n1732;

public class Solution {
    public int largestAltitude(int[] gain) {
        var altitude = 0;
        var result = 0;

        for (var i = 0; i < gain.length; i++) {
            altitude += gain[i];
            result = Math.max(result, altitude);
        }

        return result;
    }
}
