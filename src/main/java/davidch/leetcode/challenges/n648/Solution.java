package davidch.leetcode.challenges.n648;

import java.util.List;

public class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        final var dict = new Trie[26];
        for (var word: dictionary) {
            final var chars = word.toCharArray();
            var currentTrie = dict;
            for (var i = 0; i < chars.length; i++) {
                final var ch = chars[i];
                final var idx = ch - 'a';
                if (currentTrie[idx] == null) currentTrie[idx] = new Trie(ch, new Trie[26]);
                if (currentTrie[idx].end) break;
                currentTrie[idx].end = i == chars.length - 1;
                currentTrie = currentTrie[idx].suffixes;
            }
        }

        final var result = new StringBuilder();
        final var sentenceWords = sentence.split(" ");
        for (var wordIdx = 0; wordIdx < sentenceWords.length; wordIdx++) {
            final var word = sentenceWords[wordIdx];
            final var chars = word.toCharArray();
            var currentTrie = dict;
            var wasAdded = false;
            for (var i = 0; i < chars.length; i++) {
                final var idx = chars[i] - 'a';
                if (currentTrie[idx] == null) {
                    result.append(word);
                    if (wordIdx != sentenceWords.length - 1) result.append(" ");
                    wasAdded = true;
                    break;
                }
                if (currentTrie[idx].end) {
                    result.append(word.substring(0, i + 1));
                    if (wordIdx != sentenceWords.length - 1) result.append(" ");
                    wasAdded = true;
                    break;
                }

                currentTrie = currentTrie[idx].suffixes;
            }

            if (!wasAdded) {
                result.append(word);
                if (wordIdx != sentenceWords.length - 1) result.append(" ");
            }
        }

        return result.toString();
    }

    private class Trie {
        private final char ch;
        private boolean end;
        private final Trie[] suffixes;

        private Trie(char ch, Trie[] suffixes) {
            this.ch = ch;
            this.suffixes = suffixes;
        }
    }
}
