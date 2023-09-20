package davidch.leetcode.challenges.n9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        var reversed = 0;
        var buf = x;
        while (buf > 0) {
            reversed = reversed * 10 + buf % 10;
            buf /= 10;
        }

        return reversed == x;
    }
}
