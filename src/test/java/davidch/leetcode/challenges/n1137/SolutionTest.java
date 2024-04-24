package davidch.leetcode.challenges.n1137;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.tribonacci(4);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.tribonacci(25);
        assertThat(result).isEqualTo(1389537);
    }
}