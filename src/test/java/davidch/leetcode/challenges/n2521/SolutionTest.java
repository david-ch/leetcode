package davidch.leetcode.challenges.n2521;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {2, 4, 3, 7, 10, 6};
        final var result = solution.distinctPrimeFactors(nums);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 4, 8, 16};
        final var result = solution.distinctPrimeFactors(nums);
        assertThat(result).isEqualTo(1);
    }
}