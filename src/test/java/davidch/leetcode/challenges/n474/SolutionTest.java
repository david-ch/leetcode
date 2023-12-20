package davidch.leetcode.challenges.n474;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] strs = {"10", "0001", "111001", "1", "0"};
        final var result = solution.findMaxForm(strs, 5, 3);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final String[] strs = {"10", "0", "1"};
        final var result = solution.findMaxForm(strs, 1, 1);
        assertThat(result).isEqualTo(2);
    }
}