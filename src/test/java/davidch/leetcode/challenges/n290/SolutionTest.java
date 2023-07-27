package davidch.leetcode.challenges.n290;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.wordPattern("abba", "dog cat cat dog");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.wordPattern("abba", "dog cat cat fish");
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var result = solution.wordPattern("aaaa", "dog cat cat dog");
        assertThat(result).isFalse();
    }

    @Test
    void example_4() {
        final var result = solution.wordPattern("abba", "dog dog dog dog");
        assertThat(result).isFalse();
    }
}