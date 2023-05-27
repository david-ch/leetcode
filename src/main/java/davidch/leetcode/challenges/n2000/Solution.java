package davidch.leetcode.challenges.n2000;

public class Solution {
    public String reversePrefix(String word, char ch) {
        final var chIdx = word.indexOf(ch);
        if (chIdx == -1) {
            return word;
        }

        final var result = new char[word.length()];
        for (var i = chIdx; i >= 0; i--) {
            result[chIdx - i] = word.charAt(i);
        }

        for (var i = chIdx + 1; i < word.length(); i++) {
            result[i] = word.charAt(i);
        }

        return new String(result);
    }
}
