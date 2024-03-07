package davidch.leetcode.challenges.n2544;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.alternateDigitSum(521);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.alternateDigitSum(111);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final var result = solution.alternateDigitSum(886996);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_4() {
        final var result = solution.alternateDigitSum(10);
        assertThat(result).isEqualTo(1);
    }
}