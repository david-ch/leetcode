package davidch.leetcode.challenges.n1413;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {-3, 2, -3, 4, 2};

        final var result = solution.minStartValue(nums);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2};

        final var result = solution.minStartValue(nums);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final int[] nums = {1, -2, -3};

        final var result = solution.minStartValue(nums);

        assertThat(result).isEqualTo(5);
    }
}