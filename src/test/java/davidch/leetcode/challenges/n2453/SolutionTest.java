package davidch.leetcode.challenges.n2453;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {3, 7, 8, 1, 1, 5};
        final var result = solution.destroyTargets(nums, 2);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 3, 5, 2, 4, 6};
        final var result = solution.destroyTargets(nums, 2);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final int[] nums = {6, 2, 5};
        final var result = solution.destroyTargets(nums, 100);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_4() {
        final int[] nums = {691};
        final var result = solution.destroyTargets(nums, 4);
        assertThat(result).isEqualTo(691);
    }

    @Test
    void example_5() {
        final int[] nums = {1, 5, 3, 2, 2};
        final var result = solution.destroyTargets(nums, 10000);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_6() {
        final int[] nums = {625879766, 235326233, 250224393, 501422042, 683823101, 948619719, 680305710, 733191937, 182186779, 353350082};
        final var result = solution.destroyTargets(nums, 4);
        assertThat(result).isEqualTo(235326233);
    }
}