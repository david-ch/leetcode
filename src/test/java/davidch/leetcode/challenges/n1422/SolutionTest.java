package davidch.leetcode.challenges.n1422;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.maxScore("011101");
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_2() {
        final var result = solution.maxScore("00111");
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_3() {
        final var result = solution.maxScore("1111");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_4() {
        final var result = solution.maxScore("0000");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_5() {
        final var result = solution.maxScore("0100");
        assertThat(result).isEqualTo(2);
    }
}