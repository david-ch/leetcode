package davidch.leetcode.challenges.n2971;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {5, 5, 5};
        final var result = solution.largestPerimeter(nums);
        assertThat(result).isEqualTo(15);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 12, 1, 2, 5, 50, 3};
        final var result = solution.largestPerimeter(nums);
        assertThat(result).isEqualTo(12);
    }

    @Test
    void example_3() {
        final int[] nums = {5, 5, 50};
        final var result = solution.largestPerimeter(nums);
        assertThat(result).isEqualTo(-1);
    }
}