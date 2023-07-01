package davidch.leetcode.challenges.n71;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.simplifyPath("/home/");
        assertThat(result).isEqualTo("/home");
    }

    @Test
    void example_2() {
        final var result = solution.simplifyPath("/../");
        assertThat(result).isEqualTo("/");
    }

    @Test
    void example_3() {
        final var result = solution.simplifyPath("/home//foo/");
        assertThat(result).isEqualTo("/home/foo");
    }

    @Test
    void example_4() {
        final var result = solution.simplifyPath("/home//foo");
        assertThat(result).isEqualTo("/home/foo");
    }

    @Test
    void example_5() {
        final var result = solution.simplifyPath("/home/././foo");
        assertThat(result).isEqualTo("/home/foo");
    }

    @Test
    void example_6() {
        final var result = solution.simplifyPath("/home/././.../foo");
        assertThat(result).isEqualTo("/home/.../foo");
    }
}