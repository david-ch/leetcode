package davidch.leetcode.challenges.n752;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        final var result = solution.openLock(deadends, "0202");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final String[] deadends = {"8888"};
        final var result = solution.openLock(deadends, "0009");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final String[] deadends = {"8887","8889","8878","8898","8788","8988","7888","9888"};
        final var result = solution.openLock(deadends, "8888");
        assertThat(result).isEqualTo(-1);
    }
}