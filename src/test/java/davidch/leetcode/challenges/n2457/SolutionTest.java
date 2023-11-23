package davidch.leetcode.challenges.n2457;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.makeIntegerBeautiful(16, 6);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.makeIntegerBeautiful(467, 6);
        assertThat(result).isEqualTo(33);
    }

    @Test
    void example_3() {
        final var result = solution.makeIntegerBeautiful(1, 1);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_4() {
        final var result = solution.makeIntegerBeautiful(416, 6);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_5() {
        final var result = solution.makeIntegerBeautiful(426, 6);
        assertThat(result).isEqualTo(74);
    }

    @Test
    void example_6() {
        final var result = solution.makeIntegerBeautiful(6068060761L, 3);
        assertThat(result).isEqualTo(3931939239L);
    }

    @Test
    void example_7() {
        final var result = solution.makeIntegerBeautiful(112279430545L, 41);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_8() {
        final var result = solution.makeIntegerBeautiful(100000000001L, 1);
        assertThat(result).isEqualTo(899999999999L);
    }
}