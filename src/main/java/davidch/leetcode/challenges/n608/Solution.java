package davidch.leetcode.challenges.n608;

public class Solution {

    public boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length() - 1, true);
    }

    private boolean validPalindrome(String s, int left, int right, boolean shouldSkip) {
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return shouldSkip && validPalindromeSkippingChar(s, left, right);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean validPalindromeSkippingChar(String s, int left, int right) {
        return validPalindrome(s, left + 1, right, false)
                || validPalindrome(s, left, right - 1, false);
    }
}

