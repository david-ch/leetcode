package davidch.leetcode.challenges.n1189;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.maxNumberOfBalloons("nlaebolko");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final var result = solution.maxNumberOfBalloons("loonbalxballpoon");
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final var result = solution.maxNumberOfBalloons("leetcode");
        assertThat(result).isEqualTo(0);
    }
}