package davidch.leetcode.challenges.n632;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var nums = List.of(
                List.of(4, 10, 15, 24, 26),
                List.of(0, 9, 12, 20),
                List.of(5, 18, 22, 30)
        );
        final var result = solution.smallestRange(nums);
        assertThat(result).isEqualTo(new int[]{20, 24});
    }

    @Test
    void example_2() {
        final var nums = List.of(
                List.of(1, 2, 3),
                List.of(1, 2, 3),
                List.of(1, 2, 3)
        );
        final var result = solution.smallestRange(nums);
        assertThat(result).isEqualTo(new int[]{1, 1});
    }
}