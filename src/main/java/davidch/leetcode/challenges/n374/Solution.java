package davidch.leetcode.challenges.n374;

public class Solution {

    private final int pick;

    public Solution(int pick) {
        this.pick = pick;
    }

    public int guessNumber(int n) {
        var left = 1;
        var right = n;
        while (left < right) {
            final var mid = left + (right - left) / 2;
            final var result = guess(mid);
            if (result == 0) return mid;
            else if (result == -1) right = mid - 1;
            else left = mid + 1;
        }

        return left;
    }

    private int guess(int num) {
        if (num == pick) return 0;
        if (num > pick) return -1;
        return 1;
    }
}