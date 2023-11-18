package davidch.leetcode.challenges.n2405;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.partitionString("abacaba");
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.partitionString("ssssss");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_3() {
        final var result = solution.partitionString("hdklqkcssgxlvehva");
        assertThat(result).isEqualTo(4);
    }
}