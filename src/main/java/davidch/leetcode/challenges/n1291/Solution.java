package davidch.leetcode.challenges.n1291;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        final var result = new ArrayList<Integer>();

        final var digitsFrom = (int) Math.log10(low);
        final var digitsTo = (int) Math.log10(high);
        for (var digits = digitsFrom; digits <= digitsTo; digits++) {
            final var denominator = (int) Math.pow(10, digits);
            var num = (int) (123456789 / Math.pow(10, 8 - digits));
            var nextDigit = digits + 2;

            while (nextDigit <= 10) {
                if (num > high) return result;
                if (num >= low) result.add(num);
                num %= denominator;
                num *= 10;
                num += nextDigit;
                nextDigit++;
            }
        }

        return result;
    }
}
