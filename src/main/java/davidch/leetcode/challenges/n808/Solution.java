package davidch.leetcode.challenges.n808;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public double soupServings(int n) {
        if (n > 4800) return 1;
        final var memo = new HashMap<Remaining, Double>();

        return soupServings(new Remaining(n, n), memo);
    }

    private double soupServings(Remaining remaining, Map<Remaining, Double> memo) {
        if (remaining.a <= 0 && remaining.b <= 0) return 0.5;
        if (remaining.a <= 0) return 1;
        if (remaining.b <= 0) return 0;

        var result = memo.get(remaining);
        if (result == null) {
            result = 0.25 * (
                    soupServings(new Remaining(remaining.a - 100, remaining.b), memo)
                    + soupServings(new Remaining(remaining.a - 75, remaining.b - 25), memo)
                    + soupServings(new Remaining(remaining.a - 50, remaining.b - 50), memo)
                    + soupServings(new Remaining(remaining.a - 25, remaining.b - 75), memo)
            );

            memo.put(remaining, result);
        }

        return result;
    }


    private record Remaining(int a, int b) {
    }
}
