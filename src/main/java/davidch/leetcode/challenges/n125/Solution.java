package davidch.leetcode.challenges.n125;

public class Solution {
    public boolean isPalindrome(String s) {
        final var chars = s.toCharArray();
        var left = 0;
        var right = s.length() - 1;

        while (left < right) {
            if (!(chars[left] >= 'a' && chars[left] <= 'z')
                && !(chars[left] >= 'A' && chars[left] <= 'Z')
                && !(chars[left] >= '0' && chars[left] <= '9')) {
                left++;
                continue;
            }

            if (!(chars[right] >= 'a' && chars[right] <= 'z')
                && !(chars[right] >= 'A' && chars[right] <= 'Z')
                && !(chars[right] >= '0' && chars[right] <= '9')) {
                right--;
                continue;
            }

            if (chars[left] == chars[right]
                || chars[left] >= 'a' && chars[left] <= 'z' && chars[right] >= 'A' && chars[right] <= 'Z' && chars[left] == chars[right] + 32
                || chars[right] >= 'a' && chars[right] <= 'z' && chars[left] >= 'A' && chars[left] <= 'Z' && chars[right] == chars[left] + 32) {
                left++;
                right--;
                continue;
            }

            return false;
        }

        return true;
    }
}
