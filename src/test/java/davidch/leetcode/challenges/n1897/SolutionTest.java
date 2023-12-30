package davidch.leetcode.challenges.n1897;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] words = {"abc", "aabc", "bc"};
        final var result = solution.makeEqual(words);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final String[] words = {"ab", "a"};
        final var result = solution.makeEqual(words);
        assertThat(result).isFalse();
    }
}