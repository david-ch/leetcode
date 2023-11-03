package davidch.leetcode.challenges.n1481;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {5, 5, 4};
        final var result = solution.findLeastNumOfUniqueInts(arr, 1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[] arr = {4, 3, 1, 1, 3, 3, 2};
        final var result = solution.findLeastNumOfUniqueInts(arr, 3);
        assertThat(result).isEqualTo(2);
    }
}