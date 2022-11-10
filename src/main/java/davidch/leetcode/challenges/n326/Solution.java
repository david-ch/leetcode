package davidch.leetcode.challenges.n326;

public class Solution {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        double num = n;
        while (num > 2 && num % 1 == 0) {
            if (num == 3) {
                return true;
            }

            num = num / 3;
        }

        return false;
    }
}
