package davidch.leetcode.challenges.n345;

public class Solution {
    public String reverseVowels(String s) {
        final var chars = s.toCharArray();

        var left = 0;
        var right = chars.length - 1;

        while (left < right) {
            final var leftIsVowel = isVowel(chars[left]);
            final var rightIsVowel = isVowel(chars[right]);
            if (leftIsVowel && rightIsVowel) {
                final var temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
                continue;
            }

            if (!leftIsVowel) left++;
            if (!rightIsVowel) right--;
        }

        return new String(chars);
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
