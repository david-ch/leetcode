package davidch.leetcode.challenges.n2515;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] words = {"hello", "i", "am", "leetcode", "hello"};
        final var result = solution.closetTarget(words, "hello", 1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final String[] words = {"a", "b", "leetcode"};
        final var result = solution.closetTarget(words, "leetcode", 0);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final String[] words = {"i", "eat", "leetcode"};
        final var result = solution.closetTarget(words, "ate", 0);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_4() {
        final String[] words = {"hsdqinnoha", "mqhskgeqzr", "zemkwvqrww", "zemkwvqrww", "daljcrktje", "fghofclnwp", "djwdworyka", "cxfpybanhd", "fghofclnwp", "fghofclnwp"};
        final var result = solution.closetTarget(words, "zemkwvqrww", 8);
        assertThat(result).isEqualTo(4);
    }
}