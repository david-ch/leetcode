package davidch.leetcode.challenges.n2457;

public class Solution {

    public long makeIntegerBeautiful(long n, int target) {
        final var digits = (int) Math.log10(n);

        long sum = 0;
        var digitsToReset = -1;
        var lastNonZero = -1;
        for (var d = digits; d >= 0; d--) {
            final var digit = (int) (n / Math.pow(10, d) % 10);

            sum += digit;
            if (sum > target) {
                digitsToReset = sum - digit + 1 > target ? lastNonZero : d;
                break;
            }

            if (digit != 0) lastNonZero = d;
        }

        if (digitsToReset == -1) return 0;

        final var multiplier = (long) Math.pow(10, digitsToReset + 1);
        return multiplier - (n % multiplier);
    }
}
