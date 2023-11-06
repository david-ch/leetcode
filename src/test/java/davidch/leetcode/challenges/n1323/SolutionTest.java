package davidch.leetcode.challenges.n1323;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.maximum69Number(9669);
        assertThat(result).isEqualTo(9969);
    }

    @Test
    void example_2() {
        final var result = solution.maximum69Number(9996);
        assertThat(result).isEqualTo(9999);
    }

    @Test
    void example_3() {
        final var result = solution.maximum69Number(9999);
        assertThat(result).isEqualTo(9999);
    }

    @Test
    void example_4() {
        final var result = solution.maximum69Number(6);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void example_5() {
        final var result = solution.maximum69Number(9);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void example_6() {
        final var result = solution.maximum69Number(66);
        assertThat(result).isEqualTo(96);
    }

    @Test
    void example_7() {
        final var result = solution.maximum69Number(966);
        assertThat(result).isEqualTo(996);
    }
}