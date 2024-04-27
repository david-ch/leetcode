package davidch.leetcode.challenges.n514;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.findRotateSteps("godding", "gd");
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.findRotateSteps("godding", "godding");
        assertThat(result).isEqualTo(13);
    }
}