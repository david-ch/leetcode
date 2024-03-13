package davidch.leetcode.challenges.n2485;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.pivotInteger(8);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final var result = solution.pivotInteger(1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final var result = solution.pivotInteger(4);
        assertThat(result).isEqualTo(-1);
    }
}