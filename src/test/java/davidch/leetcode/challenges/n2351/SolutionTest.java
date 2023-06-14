package davidch.leetcode.challenges.n2351;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.repeatedCharacter("abccbaacz");
        assertThat(result).isEqualTo('c');
    }

    @Test
    void example_2() {
        final var result = solution.repeatedCharacter("abcdd");
        assertThat(result).isEqualTo('d');
    }
}