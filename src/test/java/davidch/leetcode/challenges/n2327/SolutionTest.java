package davidch.leetcode.challenges.n2327;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.peopleAwareOfSecret(6, 2, 4);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_2() {
        final var result = solution.peopleAwareOfSecret(4, 1, 3);

        assertThat(result).isEqualTo(6);
    }
}