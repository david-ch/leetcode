package davidch.leetcode.challenges.n551;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.checkRecord("PPALLP");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.checkRecord("PPALLL");
        assertThat(result).isFalse();
    }
}