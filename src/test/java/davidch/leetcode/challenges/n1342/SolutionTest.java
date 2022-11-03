package davidch.leetcode.challenges.n1342;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.numberOfSteps(14);

        assertThat(result).isEqualTo(6);
    }


    @Test
    void example_2() {
        final var result = solution.numberOfSteps(8);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final var result = solution.numberOfSteps(123);

        assertThat(result).isEqualTo(12);
    }
}