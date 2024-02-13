package davidch.leetcode.challenges.n2108;

public class Solution {
    public String firstPalindrome(String[] words) {
        for (var word : words) {
            final var chars = word.toCharArray();
            var left = 0;
            var right = chars.length - 1;
            while (left < right && chars[left] == chars[right]) {
                left++;
                right--;
            }

            if (left == right || chars.length % 2 == 0 && left - 1 == right) return word;
        }

        return "";
    }
}
