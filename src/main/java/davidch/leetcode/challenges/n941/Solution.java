package davidch.leetcode.challenges.n941;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        var idx = 0;
        while (idx + 1 < arr.length && arr[idx] < arr[idx + 1]) idx++;
        if (idx == 0 || idx == arr.length - 1) return false;
        while (idx + 1 < arr.length && arr[idx] > arr[idx + 1]) idx++;
        return idx == arr.length - 1;
    }
}
