package davidch.leetcode.challenges.n1624;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.maxLengthBetweenEqualCharacters("aa");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final var result = solution.maxLengthBetweenEqualCharacters("abca");
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final var result = solution.maxLengthBetweenEqualCharacters("cbzxy");
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_4() {
        final var result = solution.maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv");
        assertThat(result).isEqualTo(18);
    }
}