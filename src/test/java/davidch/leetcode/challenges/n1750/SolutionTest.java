package davidch.leetcode.challenges.n1750;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.minimumLength("ca");
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final var result = solution.minimumLength("cabaabac");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final var result = solution.minimumLength("aabccabba");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_4() {
        final var result = solution.minimumLength("bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb");
        assertThat(result).isEqualTo(1);
    }

}