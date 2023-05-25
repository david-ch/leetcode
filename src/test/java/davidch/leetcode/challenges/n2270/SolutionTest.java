package davidch.leetcode.challenges.n2270;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {10, 4, -8, 7};

        final var result = solution.waysToSplitArray(nums);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 3, 1, 0};

        final var result = solution.waysToSplitArray(nums);

        assertThat(result).isEqualTo(2);
    }
}
