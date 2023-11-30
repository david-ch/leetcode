package davidch.leetcode.challenges.n1299;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {17, 18, 5, 4, 6, 1};
        final int[] expectedResult = {18, 6, 6, 6, 1, -1};
        final var result = solution.replaceElements(arr);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] arr = {400};
        final int[] expectedResult = {-1};
        final var result = solution.replaceElements(arr);
        assertThat(result).isEqualTo(expectedResult);
    }
}