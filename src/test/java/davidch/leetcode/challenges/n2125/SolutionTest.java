package davidch.leetcode.challenges.n2125;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] bank = {
                "011001",
                "000000",
                "010100",
                "001000"
        };
        final var result = solution.numberOfBeams(bank);
        assertThat(result).isEqualTo(8);
    }

    @Test
    void example_2() {
        final String[] bank = {"000", "111", "000"};
        final var result = solution.numberOfBeams(bank);
        assertThat(result).isEqualTo(0);
    }
}