package davidch.leetcode.challenges.n1338;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        final var result = solution.minSetSize(arr);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] arr = {7, 7, 7, 7, 7, 7};
        final var result = solution.minSetSize(arr);
        assertThat(result).isEqualTo(1);
    }
}