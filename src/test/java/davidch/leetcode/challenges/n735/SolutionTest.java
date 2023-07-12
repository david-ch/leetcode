package davidch.leetcode.challenges.n735;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] asteroids = {5, 10, -5};
        final int[] expectedResult = {5, 10};
        final var result = solution.asteroidCollision(asteroids);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] asteroids = {8, -8};
        final int[] expectedResult = {};
        final var result = solution.asteroidCollision(asteroids);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] asteroids = {10, 2, -5};
        final int[] expectedResult = {10};
        final var result = solution.asteroidCollision(asteroids);
        assertThat(result).isEqualTo(expectedResult);
    }
}