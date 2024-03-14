package davidch.leetcode.challenges.n1431;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] candies = {2, 3, 5, 1, 3};
        final var result = solution.kidsWithCandies(candies, 3);
        assertThat(result).isEqualTo(List.of(true, true, true, false, true));
    }

    @Test
    void example_2() {
        final int[] candies = {4, 2, 1, 1, 2};
        final var result = solution.kidsWithCandies(candies, 1);
        assertThat(result).isEqualTo(List.of(true, false, false, false, false));
    }

    @Test
    void example_3() {
        final int[] candies = {12, 1, 12};
        final var result = solution.kidsWithCandies(candies, 10);
        assertThat(result).isEqualTo(List.of(true, false, true));
    }
}