 package davidch.leetcode.challenges.n46;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3};
        final var expectedResult = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );
        final var result = solution.permute(nums);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 1};
        final var expectedResult = List.of(
                List.of(0, 1),
                List.of(1, 0)
        );
        final var result = solution.permute(nums);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] nums = {1};
        final var expectedResult = List.of(
                List.of(1)
        );
        final var result = solution.permute(nums);
        assertThat(result).isEqualTo(expectedResult);
    }
}