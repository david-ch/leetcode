package davidch.leetcode.challenges.n451;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.frequencySort("tree");
        assertThat(result).isEqualTo("eert");
    }

    @Test
    void example_2() {
        final var result = solution.frequencySort("cccaaa");
        assertThat(result).isEqualTo("aaaccc");
    }


    @Test
    void example_3() {
        final var result = solution.frequencySort("Aabb");
        assertThat(result).isEqualTo("bbAa");
    }
}