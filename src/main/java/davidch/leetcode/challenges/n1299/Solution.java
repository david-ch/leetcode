package davidch.leetcode.challenges.n1299;

public class Solution {
    public int[] replaceElements(int[] arr) {
        var max = -1;
        for (var i = arr.length - 1; i >= 0; i--) {
            final var newMax = Math.max(max, arr[i]);
            arr[i] = max;
            max = newMax;
        }
        return arr;
    }
}
