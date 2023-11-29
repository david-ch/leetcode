package davidch.leetcode.challenges.n1295;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {12, 345, 2, 6, 7896};
        final var result = solution.findNumbers(arr);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] arr = {555, 901, 482, 1771};
        final var result = solution.findNumbers(arr);
        assertThat(result).isEqualTo(1);
    }
}