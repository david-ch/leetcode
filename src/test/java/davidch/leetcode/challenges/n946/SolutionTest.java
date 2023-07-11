package davidch.leetcode.challenges.n946;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] pushed = {1, 2, 3, 4, 5};
        final int[] popped = {4, 5, 3, 2, 1};
        final var result = solution.validateStackSequences(pushed, popped);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] pushed = {1, 2, 3, 4, 5};
        final int[] popped = {4, 3, 5, 1, 2};
        final var result = solution.validateStackSequences(pushed, popped);
        assertThat(result).isFalse();
    }
}