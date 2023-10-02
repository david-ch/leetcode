package davidch.leetcode.challenges.n1376;

public class Solution {
    public int numOfMinutes(int n, int ignoredHeadID, int[] manager, int[] informTime) {
        var result = 0;
        for (var i = 0; i < n; i++) {
            result = Math.max(result, measureTime(i, manager, informTime));
        }
        return result;
    }

    private int measureTime(int i, int[] manager, int[] informTime) {
        if (manager[i] != -1) {
            informTime[i] += measureTime(manager[i], manager, informTime);
            manager[i] = -1;
        }
        return informTime[i];
    }
}
