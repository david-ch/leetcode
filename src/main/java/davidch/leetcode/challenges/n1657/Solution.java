package davidch.leetcode.challenges.n1657;

import java.util.Arrays;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        final var wordLen = word1.length();
        if (wordLen != word2.length()) return false;

        final var word1CharsCounts = new int['z' - 'a' + 1];
        var word1UsedChars = 0L;
        final var word2CharsCounts = new int['z' - 'a' + 1];
        var word2UsedChars = 0L;

        for (var i = 0; i < wordLen; i++) {
            var chIdx = word1.charAt(i) - 'a';
            word1CharsCounts[chIdx]++;
            word1UsedChars |= (1 << chIdx);

            chIdx = word2.charAt(i) - 'a';
            word2CharsCounts[chIdx]++;
            word2UsedChars |= (1 << chIdx);
        }

        Arrays.sort(word1CharsCounts);
        Arrays.sort(word2CharsCounts);

        return word1UsedChars == word2UsedChars && Arrays.equals(word1CharsCounts, word2CharsCounts);
    }
}
