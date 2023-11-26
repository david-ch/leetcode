package davidch.leetcode.challenges.n2136;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] plantTime = {1, 4, 3};
        final int[] growTime = {2, 3, 1};
        final var result = solution.earliestFullBloom(plantTime, growTime);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void example_2() {
        final int[] plantTime = {1, 2, 3, 2};
        final int[] growTime = {2, 1, 2, 1};
        final var result = solution.earliestFullBloom(plantTime, growTime);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void example_3() {
        final int[] plantTime = {1};
        final int[] growTime = {1};
        final var result = solution.earliestFullBloom(plantTime, growTime);
        assertThat(result).isEqualTo(2);
    }
}