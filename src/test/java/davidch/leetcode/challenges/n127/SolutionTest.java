package davidch.leetcode.challenges.n127;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var beginWord = "hit";
        final var endWord = "cog";
        final var wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
        final var result = solution.ladderLength(beginWord, endWord, wordList);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_2() {
        final var beginWord = "hit";
        final var endWord = "cog";
        final var wordList = List.of("hot", "dot", "dog", "lot", "log");
        final var result = solution.ladderLength(beginWord, endWord, wordList);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void word_list_contains_begin_word() {
        final var beginWord = "hit";
        final var endWord = "cog";
        final var wordList = List.of("hit", "hot", "dot", "dog", "lot", "log", "cog");
        final var result = solution.ladderLength(beginWord, endWord, wordList);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void word_list_contains_duplicates() {
        final var beginWord = "hit";
        final var endWord = "cog";
        final var wordList = List.of("hot", "hot", "hot", "dot", "dog", "lot", "log", "cog");
        final var result = solution.ladderLength(beginWord, endWord, wordList);
        assertThat(result).isEqualTo(5);
    }
}