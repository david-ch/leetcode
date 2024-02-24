package davidch.leetcode.challenges.n2092;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] meetings = {
                {1, 2, 5}, {2, 3, 8}, {1, 5, 10}
        };
        final var result = solution.findAllPeople(6, meetings, 1);
        assertThat(result).containsExactlyInAnyOrder(0, 1, 2, 3, 5);
    }

    @Test
    void example_2() {
        final int[][] meetings = {
                {3, 1, 3}, {1, 2, 2}, {0, 3, 3}
        };
        final var result = solution.findAllPeople(4, meetings, 3);
        assertThat(result).containsExactlyInAnyOrder(0, 1, 3);
    }

    @Test
    void example_3() {
        final int[][] meetings = {
                {3, 4, 2}, {1, 2, 1}, {2, 3, 1}
        };
        final var result = solution.findAllPeople(5, meetings, 1);
        assertThat(result).containsExactlyInAnyOrder(0, 1, 2, 3, 4);
    }

    @Test
    void example_4() {
        final int[][] meetings = {
                {1, 4, 3}, {0, 4, 3}
        };
        final var result = solution.findAllPeople(5, meetings, 3);
        assertThat(result).containsExactlyInAnyOrder(0, 1, 3, 4);
    }

    @Test
    void example_5() {
        final int[][] meetings = {
                {1, 4, 3}, {0, 4, 3}, {6, 5, 3}
        };
        final var result = solution.findAllPeople(7, meetings, 3);
        assertThat(result).containsExactlyInAnyOrder(0, 1, 3, 4);
    }
}