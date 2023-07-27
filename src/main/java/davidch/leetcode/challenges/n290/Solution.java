package davidch.leetcode.challenges.n290;

import java.util.HashSet;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        final var mappedWords = new HashSet<String>();
        final var charToWord = new String['z' - 'a'];
        final var words = s.split(" ");

        if (words.length != pattern.length()) return false;

        for (var i = 0; i < words.length; i++) {
            final var patternCharIdx = pattern.charAt(i) - 'a';
            if (charToWord[patternCharIdx] != null && !charToWord[patternCharIdx].equals(words[i])) return false;
            if (charToWord[patternCharIdx] == null && mappedWords.contains(words[i])) return false;

            charToWord[patternCharIdx] = words[i];
            mappedWords.add(words[i]);
        }

        return true;
    }
}
