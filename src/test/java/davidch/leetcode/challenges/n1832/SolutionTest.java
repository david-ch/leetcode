package davidch.leetcode.challenges.n1832;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.checkIfPangram("leetcode");
        assertThat(result).isFalse();
    }
}