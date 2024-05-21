package davidch.leetcode.challenges.n3144;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.minimumSubstringsInPartition("fabccddg");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var result = solution.minimumSubstringsInPartition("abababaccddb");
        assertThat(result).isEqualTo(2);
    }
}