package davidch.leetcode.challenges.n1700;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] students = {1, 1, 0, 0};
        final int[] sandwiches = {0, 1, 0, 1};
        final var result = solution.countStudents(students, sandwiches);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final int[] students = {1, 1, 1, 0, 0, 1};
        final int[] sandwiches = {1, 0, 0, 0, 1, 1};
        final var result = solution.countStudents(students, sandwiches);
        assertThat(result).isEqualTo(3);
    }
}