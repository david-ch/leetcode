package davidch.leetcode.challenges.n2370;

public class Solution {
    public int longestIdealString(String s, int k) {
        final var chars = s.toCharArray();
        final var lenEndingWith = new int['z' - 'a' + 1];
        var result = 0;

        for (var aChar : chars) {
            final var ch = aChar - 'a';
            var bestTailLen = 0;

            final var prevCharFrom = Math.max(ch - k, 0);
            final var prevCharTo = Math.min(ch + k, 'z' - 'a');
            for (var prevChar = prevCharFrom; prevChar <= prevCharTo; prevChar++)
                bestTailLen = Math.max(bestTailLen, lenEndingWith[prevChar]);

            lenEndingWith[ch] = 1 + bestTailLen;
            result = Math.max(result, lenEndingWith[ch]);
        }

        return result;
    }
}
