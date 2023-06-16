package davidch.leetcode.challenges.n1941;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.areOccurrencesEqual("abacbc");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.areOccurrencesEqual("aaabb");
        assertThat(result).isFalse();
    }
}