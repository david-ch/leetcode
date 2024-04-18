package davidch.leetcode.challenges.n338;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.countBits(2);
        final int[] expectedResult = {0, 1, 1};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final var result = solution.countBits(5);
        final int[] expectedResult = {0, 1, 1, 2, 1, 2};
        assertThat(result).isEqualTo(expectedResult);
    }
}