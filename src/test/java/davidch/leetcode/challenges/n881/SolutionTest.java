package davidch.leetcode.challenges.n881;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] people = {1, 2};
        final var result = solution.numRescueBoats(people, 3);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[] people = {3, 2, 2, 1};
        final var result = solution.numRescueBoats(people, 3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final int[] people = {3, 5, 3, 4};
        final var result = solution.numRescueBoats(people, 5);
        assertThat(result).isEqualTo(4);
    }
}