package davidch.leetcode.challenges.n1768;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.mergeAlternately("abc", "pqr");
        assertThat(result).isEqualTo("apbqcr");
    }

    @Test
    void example_2() {
        final var result = solution.mergeAlternately("ab", "pqrs");
        assertThat(result).isEqualTo("apbqrs");
    }

    @Test
    void example_3() {
        final var result = solution.mergeAlternately("abcd", "pq");
        assertThat(result).isEqualTo("apbqcd");
    }
}