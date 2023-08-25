package davidch.leetcode.challenges.n5;

public class Solution {
    public String longestPalindrome(String s) {
        Range result = new Range(0, 0);

        for (var i = 0; i < s.length(); i++) {
            result = result
                    .longest(findPalindrome(s, i, i))
                    .longest(findPalindrome(s, i, i + 1));
        }

        return s.substring(result.left, result.right);
    }

    private Range findPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return new Range(left + 1, right);
    }

    record Range(int left, int right) {
        Range longest(Range another) {
            return (right - left > another.right - another.left) ? this : another;
        }
    }
}
