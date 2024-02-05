package davidch.leetcode.challenges.n387;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.firstUniqChar("leetcode");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final var result = solution.firstUniqChar("loveleetcode");
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final var result = solution.firstUniqChar("aabb");
        assertThat(result).isEqualTo(-1);
    }
}