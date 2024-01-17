package davidch.leetcode.challenges.n1802;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.maxValue(4, 2, 6);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final var result = solution.maxValue(6, 1, 10);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final var result = solution.maxValue(3, 2, 18);
         assertThat(result).isEqualTo(7);
    }

    @Test
    void example_4() {
        final var result = solution.maxValue(8, 7, 14);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_5() {
        final var result = solution.maxValue(4, 0, 4);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_6() {
        final var result = solution.maxValue(5, 0, 28);
        assertThat(result).isEqualTo(7);
    }
}