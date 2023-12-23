package davidch.leetcode.challenges.n70;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.climbStairs(2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final var result = solution.climbStairs(3);
        assertThat(result).isEqualTo(3);
    }
}