package davidch.leetcode.challenges.n598;

public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        var minX = m;
        var minY = n;
        for (var op : ops) {
            minX = Math.min(minX, op[0]);
            minY = Math.min(minY, op[1]);
        }
        return minX * minY;
    }
}
