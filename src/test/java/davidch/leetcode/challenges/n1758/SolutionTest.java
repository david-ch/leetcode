package davidch.leetcode.challenges.n1758;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.minOperations("0100");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final var result = solution.minOperations("10");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final var result = solution.minOperations("1111");
        assertThat(result).isEqualTo(2);
    }
}