package davidch.leetcode.challenges.n347;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 1, 1, 2, 2, 3};
        final var result = solution.topKFrequent(nums, 2);
        assertThat(result).containsExactlyInAnyOrder(1, 2);
    }

    @Test
    void example_2() {
        final int[] nums = {1};
        final int[] expectedResult = {1};
        final var result = solution.topKFrequent(nums, 1);
        assertThat(result).isEqualTo(expectedResult);
    }
}