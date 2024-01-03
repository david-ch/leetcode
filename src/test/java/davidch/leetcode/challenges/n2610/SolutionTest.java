package davidch.leetcode.challenges.n2610;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 3, 4, 1, 2, 3, 1};
        final var result = solution.findMatrix(nums);
        assertThat(result).isEqualTo(
                List.of(
                        List.of(1, 3, 4, 2),
                        List.of(1, 3),
                        List.of(1)
                )
        );
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 3, 4};
        final var result = solution.findMatrix(nums);
        assertThat(result).isEqualTo(
                List.of(List.of(1, 2, 3, 4))
        );
    }

    @Test
    void example_3() {
        final int[] nums = {1, 1, 2};
        final var result = solution.findMatrix(nums);
        assertThat(result).isEqualTo(
                List.of(
                        List.of(1, 2),
                        List.of(1)
                )
        );
    }
}