package davidch.leetcode.challenges.n1323;

public class Solution {
    public int maximum69Number(int num) {
        var multiplier = (int) Math.pow(10, 1 + (int) Math.log10(num));

        while (multiplier >= 1) {
            if (num % (multiplier * 10) / multiplier == 6) break;
            multiplier /= 10;
        }

        if (multiplier >= 1) num += multiplier * 3;

        return num;
    }
}
