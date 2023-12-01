package davidch.leetcode.challenges.n941;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {2, 1};
        final var result = solution.validMountainArray(arr);
        assertThat(result).isFalse();
    }

    @Test
    void example_2() {
        final int[] arr = {3, 5, 5};
        final var result = solution.validMountainArray(arr);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final int[] arr = {0, 3, 2, 1};
        final var result = solution.validMountainArray(arr);
        assertThat(result).isTrue();
    }

    @Test
    void example_4() {
        final int[] arr = {1,3,2};
        final var result = solution.validMountainArray(arr);
        assertThat(result).isTrue();
    }

    @Test
    void example_5() {
        final int[] arr = {0,1,2,3,4,5,6,7,8,9};
        final var result = solution.validMountainArray(arr);
        assertThat(result).isFalse();
    }
}