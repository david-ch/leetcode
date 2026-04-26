package davidch.leetcode.challenges.n1559;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final char[][] grid = {
            {'a', 'a', 'a', 'a'},
            {'a', 'b', 'b', 'a'},
            {'a', 'b', 'b', 'a'},
            {'a', 'a', 'a', 'a'}
        };
        final var result = solution.containsCycle(grid);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final char[][] grid = {
            {'c', 'c', 'c', 'a'},
            {'c', 'd', 'c', 'c'},
            {'c', 'c', 'e', 'c'},
            {'f', 'c', 'c', 'c'}
        };
        final var result = solution.containsCycle(grid);
        assertThat(result).isTrue();
    }

    @Test
    void example_3() {
        final char[][] grid = {
            {'a', 'b', 'b'},
            {'b', 'z', 'b'},
            {'b', 'b', 'a'}
        };
        final var result = solution.containsCycle(grid);
        assertThat(result).isFalse();
    }

    @Test
    void example_4() {
        final char[][] grid = {
            {'d', 'b', 'b'},
            {'c', 'a', 'a'},
            {'b', 'a', 'c'},
            {'c', 'c', 'c'},
            {'d', 'd', 'a'}
        };
        final var result = solution.containsCycle(grid);
        assertThat(result).isFalse();
    }
}