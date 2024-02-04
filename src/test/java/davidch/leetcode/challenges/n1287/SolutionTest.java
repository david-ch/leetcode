package davidch.leetcode.challenges.n1287;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        final var result = solution.findSpecialInteger(arr);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final int[] arr = {1, 1};
        final var result = solution.findSpecialInteger(arr);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final int[] arr = {15, 15, 21, 21, 32, 32, 33, 33, 33, 34, 35};
        final var result = solution.findSpecialInteger(arr);
        assertThat(result).isEqualTo(33);
    }
}