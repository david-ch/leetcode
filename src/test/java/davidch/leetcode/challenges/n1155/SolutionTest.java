package davidch.leetcode.challenges.n1155;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.numRollsToTarget(1, 6, 3);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final var result = solution.numRollsToTarget(2, 6, 7);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_3() {
        final var result = solution.numRollsToTarget(30, 30, 500);
        assertThat(result).isEqualTo(222616187);
    }
}