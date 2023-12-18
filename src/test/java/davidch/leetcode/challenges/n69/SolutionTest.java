package davidch.leetcode.challenges.n69;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.mySqrt(4);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final var result = solution.mySqrt(8);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final var result = solution.mySqrt(9);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_4() {
        final var result = solution.mySqrt(2);
        assertThat(result).isEqualTo(1);
    }
}