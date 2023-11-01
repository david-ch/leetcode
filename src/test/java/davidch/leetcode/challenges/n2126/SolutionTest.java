package davidch.leetcode.challenges.n2126;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] asteroids = {3, 9, 19, 5, 21};
        final var result = solution.asteroidsDestroyed(10, asteroids);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] asteroids = {4, 9, 23, 4};
        final var result = solution.asteroidsDestroyed(5, asteroids);
        assertThat(result).isFalse();
    }
}