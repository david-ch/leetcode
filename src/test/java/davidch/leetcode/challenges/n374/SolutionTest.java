package davidch.leetcode.challenges.n374;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void example_1() {
        final var result = new Solution(6).guessNumber(10);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final var result = new Solution(1).guessNumber(1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final var result = new Solution(1).guessNumber(2);
        assertThat(result).isEqualTo(1);
    }
}