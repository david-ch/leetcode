package davidch.leetcode.challenges.n334;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3, 4, 5};
        final var result = solution.increasingTriplet(nums);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] nums = {5, 4, 3, 2, 1};
        final var result = solution.increasingTriplet(nums);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final int[] nums = {2, 1, 5, 0, 4, 6};
        final var result = solution.increasingTriplet(nums);
        assertThat(result).isTrue();
    }

    @Test
    void example_4() {
        final int[] nums = {5, 10, 2, 3, 7};
        final var result = solution.increasingTriplet(nums);
        assertThat(result).isTrue();
    }

    @Test
    void example_5() {
        final int[] nums = {5, 10, 2, 11};
        final var result = solution.increasingTriplet(nums);
        assertThat(result).isTrue();
    }

    @Test
    void example_6() {
        final int[] nums = {5, 10, 6, 7};
        final var result = solution.increasingTriplet(nums);
        assertThat(result).isTrue();
    }
}