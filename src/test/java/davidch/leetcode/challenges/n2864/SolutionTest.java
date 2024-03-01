package davidch.leetcode.challenges.n2864;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.maximumOddBinaryNumber("010");
        assertThat(result).isEqualTo("001");
    }

    @Test
    void example_2() {
        final var result = solution.maximumOddBinaryNumber("0101");
        assertThat(result).isEqualTo("1001");
    }
}