package davidch.leetcode.challenges.n1137;

public class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        var t0 = 0;
        var t1 = 1;
        var t2 = 1;
        for (var i = 3; i <= n; i++) {
            final var t = t0;
            t0 = t1;
            t1 = t2;
            t2 = t1 + t0 + t;
        }

        return t2;
    }
}
