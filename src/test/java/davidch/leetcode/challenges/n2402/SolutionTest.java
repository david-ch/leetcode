package davidch.leetcode.challenges.n2402;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] meetings = {{0, 10}, {1, 5}, {2, 7}, {3, 4}};
        final var result = solution.mostBooked(2, meetings);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final int[][] meetings = {{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}};
        final var result = solution.mostBooked(3, meetings);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final int[][] meetings = {{18, 19}, {3, 12}, {17, 19}, {2, 13}, {7, 10}};
        final var result = solution.mostBooked(4, meetings);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_4() {
        final int[][] meetings = {{3, 7}, {12, 19}, {16, 17}, {1, 17}, {5, 6}};
        final var result = solution.mostBooked(3, meetings);
        assertThat(result).isEqualTo(1);
    }



}