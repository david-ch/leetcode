package davidch.leetcode.challenges.n7;

public class Solution {

    private static final int LAST_STEP_BEFORE_MAX_INT_OVERFLOW = Integer.MAX_VALUE / 10;
    private static final int LAST_STEP_BEFORE_MIN_INT_OVERFLOW = Integer.MIN_VALUE / 10;
    private static final int MAX_INTEGER_LAST_DIGIT = 7;
    private static final int MIN_INTEGER_LAST_DIGIT = 8;

    public int reverse(int x) {
        var result = 0;
        while (Math.abs(x) > 0) {
            final var digit = x % 10;
            if (result > LAST_STEP_BEFORE_MAX_INT_OVERFLOW || (result == LAST_STEP_BEFORE_MAX_INT_OVERFLOW && digit > MAX_INTEGER_LAST_DIGIT)) return 0;
            if(result < LAST_STEP_BEFORE_MIN_INT_OVERFLOW || (result == LAST_STEP_BEFORE_MIN_INT_OVERFLOW && digit < -MIN_INTEGER_LAST_DIGIT)) return 0;
            result = result * 10 + digit;
            x /= 10;
        }
        return result;
    }
}
