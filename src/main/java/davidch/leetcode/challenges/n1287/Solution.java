package davidch.leetcode.challenges.n1287;

public class Solution {
    public int findSpecialInteger(int[] arr) {
        final var quarter = (int) Math.floor(arr.length / 4.);
        for (var i = 0; i < arr.length; i++) {
            final var num = arr[i];
            if (num == arr[Math.min(i + quarter, arr.length - 1)]) return num;
        }
        return -1;
    }
}
