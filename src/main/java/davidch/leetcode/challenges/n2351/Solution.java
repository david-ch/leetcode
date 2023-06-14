package davidch.leetcode.challenges.n2351;

public class Solution {
    public char repeatedCharacter(String s) {
        var seenLetters = 0;

        final var len = s.length();
        for (var i = 0; i < len; i++) {
            final var ch = s.charAt(i);
            var newSeenLetters = seenLetters | 1 << (ch - 'a');
            if (newSeenLetters == seenLetters) return ch;
            seenLetters = newSeenLetters;
        }

        throw new IllegalArgumentException("Solution wasn't found");
    }
}
