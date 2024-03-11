package davidch.leetcode.challenges.n1768;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        final var result = new char[word1.length() + word2.length()];
        final var word1Chars = word1.toCharArray();
        final var word2Chars = word2.toCharArray();

        var i = 0;
        var w1 = 0;
        var w2 = 0;
        while (i < result.length) {
            if (w1 < word1Chars.length) result[i++] = word1Chars[w1++];
            if (w2 < word2Chars.length) result[i++] = word2Chars[w2++];
        }

        return new String(result);
    }
}
