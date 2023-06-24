package davidch.leetcode.challenges.n1394;

public class Solution {
    public int findLucky(int[] arr) {
        final var numbersCount = new int[500];
        for (var i = 0; i < arr.length; i++) {
            numbersCount[arr[i] - 1]++;
        }

        for (var i = arr.length - 1; i >= 0; i--) {
            if (numbersCount[i] == i + 1) return i + 1;
        }

        return -1;
    }
}
