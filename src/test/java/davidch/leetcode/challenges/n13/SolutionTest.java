package davidch.leetcode.challenges.n13;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.romanToInt("III");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var result = solution.romanToInt("LVIII");
        assertThat(result).isEqualTo(58);
    }

    @Test
    void example_3() {
        final var result = solution.romanToInt("MCMXCIV");
        assertThat(result).isEqualTo(1994);
    }

    @Test
    void example_4() {
        final var result = solution.romanToInt("MDCCCLXXXIV");
        assertThat(result).isEqualTo(1884);
    }
}