package davidch.leetcode.challenges.n2544;

public class Solution {
    public int alternateDigitSum(int n) {
        var multiplier = (int) Math.floor(Math.log10(n)) % 2 == 0 ? 1 : -1;
        var result = 0;
        while (n > 0) {
            result += n % 10 * multiplier;
            n /= 10;
            multiplier *= -1;
        }
        return result;
    }
}
