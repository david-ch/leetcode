package davidch.leetcode.challenges.n1832;

public class Solution {
    private static final int ALL_LETTERS_SEEN = 0b11_11111111_11111111_11111111;

    public boolean checkIfPangram(String sentence) {
        final var len = sentence.length();
        if (len < 26) return false;

        var seenLetters = 0;
        for (var i = 0; i < len; i++) {
            seenLetters |= 1 << (sentence.charAt(i) - 'a');
            if (seenLetters == ALL_LETTERS_SEEN) return true;
        }

        return false;
    }
}
