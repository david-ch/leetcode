package davidch.leetcode.challenges.n165;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.compareVersion("1.01", "1.001");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final var result = solution.compareVersion("1.0", "1.0.0");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final var result = solution.compareVersion("0.1", "1.1");
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_4() {
        final var result = solution.compareVersion("1.0", "1.0.1");
        assertThat(result).isEqualTo(-1);
    }
}