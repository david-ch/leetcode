package davidch.leetcode.challenges.n2342;

import java.util.Arrays;

public class Solution {
    public int maximumSum(int[] nums) {
        final var seenSumsNumbers = new int[82];
        Arrays.fill(seenSumsNumbers, -1);
        var result = -1;
        for (int num : nums) {
            final var sum = sumOfDigits(num);

            final var otherNumber = seenSumsNumbers[sum];
            if (otherNumber != -1) {
                result = Math.max(result, num + otherNumber);
                seenSumsNumbers[sum] = Math.max(num, otherNumber);
            } else {
                seenSumsNumbers[sum] = num;
            }
        }

        return result;
    }

    private int sumOfDigits(int num) {
        var result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
