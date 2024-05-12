package davidch.leetcode.challenges.n2273;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        final var result = solution.removeAnagrams(words);
        assertThat(result).isEqualTo(List.of("abba", "cd"));
    }

    @Test
    void example_2() {
        final String[] words = {"a", "b", "c", "d", "e"};
        final var result = solution.removeAnagrams(words);
        assertThat(result).isEqualTo(List.of("a", "b", "c", "d", "e"));
    }

    @Test
    void example_3() {
        final String[] words = {"az", "azz"};
        final var result = solution.removeAnagrams(words);
        assertThat(result).isEqualTo(List.of("az", "azz"));
    }
}