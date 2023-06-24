package davidch.leetcode.challenges.n1394;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {2, 2, 3, 4};
        final var result = solution.findLucky(arr);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] arr = {1, 2, 2, 3, 3, 3};
        final var result = solution.findLucky(arr);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final int[] arr = {2, 2, 2, 3, 3};
        final var result = solution.findLucky(arr);
        assertThat(result).isEqualTo(-1);
    }
}