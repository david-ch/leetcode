package davidch.leetcode.challenges.n503;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var nums = new int[]{1, 2, 1};
        final var expectedResult = new int[]{2, -1, 2};
        final var result = solution.nextGreaterElements(nums);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final var nums = new int[]{1, 2, 3, 4, 3};
        final var expectedResult = new int[]{2, 3, 4, -1, 4};
        final var result = solution.nextGreaterElements(nums);
        assertThat(result).isEqualTo(expectedResult);
    }
}