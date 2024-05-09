package davidch.leetcode.challenges.n3075;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] happiness = {1, 2, 3};
        final var result = solution.maximumHappinessSum(happiness, 2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] happiness = {1, 1, 1, 1};
        final var result = solution.maximumHappinessSum(happiness, 2);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final int[] happiness = {2, 3, 4, 5};
        final var result = solution.maximumHappinessSum(happiness, 1);
        assertThat(result).isEqualTo(5);
    }
}