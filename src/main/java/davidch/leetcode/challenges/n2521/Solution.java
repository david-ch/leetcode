package davidch.leetcode.challenges.n2521;

import java.util.HashSet;

public class Solution {
    public int distinctPrimeFactors(int[] nums) {
        final var factors = new HashSet<Integer>();

        for (var n : nums) {
            for (var factor = 2; factor <= n; factor++) {
                var added = false;
                while (n % factor == 0) {
                    n /= factor;
                    if (!added) {
                        factors.add(factor);
                        added = true;
                    }
                }
            }
        }

        return factors.size();
    }
}
