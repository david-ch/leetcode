package davidch.leetcode.challenges.n917;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.reverseOnlyLetters("ab-cd");

        assertThat(result).isEqualTo("dc-ba");
    }

    @Test
    void example_2() {
        final var result = solution.reverseOnlyLetters("a-bC-dEf-ghIj");

        assertThat(result).isEqualTo("j-Ih-gfE-dCba");
    }

    @Test
    void example_3() {
        final var result = solution.reverseOnlyLetters("Test1ng-Leet=code-Q!");

        assertThat(result).isEqualTo("Qedo1ct-eeLg=ntse-T!");
    }
}