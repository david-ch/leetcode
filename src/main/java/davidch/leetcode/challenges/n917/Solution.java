package davidch.leetcode.challenges.n917;

public class Solution {
    public String reverseOnlyLetters(String s) {
        final var result = new char[s.length()];
        var left = 0;
        var right = s.length() - 1;

        while (left <= right) {
            final var leftChar = s.charAt(left);
            if (!Character.isLetter(leftChar)) {
                result[left++] = leftChar;
                continue;
            }

            final var rightChar = s.charAt(right);
            if (!Character.isLetter(rightChar)) {
                result[right--] = rightChar;
                continue;
            }

            result[left++] = rightChar;
            result[right--] = leftChar;
        }

        return new String(result);
    }
}
