package davidch.leetcode.challenges.n1346;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {10, 2, 5, 3};
        final var result = solution.checkIfExist(arr);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] arr = {3, 1, 7, 11};
        final var result = solution.checkIfExist(arr);
        assertThat(result).isFalse();
    }
}