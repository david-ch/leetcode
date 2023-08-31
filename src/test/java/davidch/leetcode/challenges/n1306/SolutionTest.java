package davidch.leetcode.challenges.n1306;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {4, 2, 3, 0, 3, 1, 2};
        final var result = solution.canReach(arr, 5);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] arr = {4, 2, 3, 0, 3, 1, 2};
        final var result = solution.canReach(arr, 0);
        assertThat(result).isTrue();
    }

    @Test
    void example_3() {
        final int[] arr = {3, 0, 2, 1, 2};
        final var result = solution.canReach(arr, 2);
        assertThat(result).isFalse();
    }
}