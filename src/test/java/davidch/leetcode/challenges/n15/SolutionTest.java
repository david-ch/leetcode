package davidch.leetcode.challenges.n15;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {-1, 0, 1, 2, -1, -4};
        final var result = solution.threeSum(nums);
        assertThat(result).hasSize(2);
        assertThat(result).anyMatch(element -> element.containsAll(List.of(-1, -1, 2)));
        assertThat(result).anyMatch(element -> element.containsAll(List.of(-1, 0, 1)));
    }

    @Test
    void example_2() {
        final int[] nums = {0, 1, 1};
        final var result = solution.threeSum(nums);
        assertThat(result).isEmpty();
    }

    @Test
    void example_3() {
        final int[] nums = {0, 0, 0};
        final var result = solution.threeSum(nums);
        assertThat(result).isEqualTo(List.of(List.of(0, 0, 0)));
    }
}