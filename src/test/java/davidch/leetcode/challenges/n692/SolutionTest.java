package davidch.leetcode.challenges.n692;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        final var result = solution.topKFrequent(words, 2);
        assertThat(result).isEqualTo(List.of("i", "love"));
    }

    @Test
    void example_2() {
        final String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        final var result = solution.topKFrequent(words, 4);
        assertThat(result).isEqualTo(List.of("the", "is", "sunny", "day"));
    }
}