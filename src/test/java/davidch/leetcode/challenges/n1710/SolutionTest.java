package davidch.leetcode.challenges.n1710;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] boxesTypes = {{1,3},{2,2},{3,1}};
        final var result = solution.maximumUnits(boxesTypes, 4);
        assertThat(result).isEqualTo(8);
    }

    @Test
    void example_2() {
        final int[][] boxesTypes = {{5,10},{2,5},{4,7},{3,9}};
        final var result = solution.maximumUnits(boxesTypes, 10);
        assertThat(result).isEqualTo(91);
    }
}