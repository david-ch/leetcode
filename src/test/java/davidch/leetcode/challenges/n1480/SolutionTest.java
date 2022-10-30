package davidch.leetcode.challenges.n1480;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void should_calculate_running_sum() {
        final var result = solution.runningSum(new int[]{1, 2, 3, 4});

        assertThat(result).isEqualTo(new int[]{1, 3, 6, 10});
    }

    @Test
    void should_calculate_running_sum_for_empty_array() {
        final var result = solution.runningSum(new int[]{});

        assertThat(result).isEqualTo(new int[]{});
    }
}