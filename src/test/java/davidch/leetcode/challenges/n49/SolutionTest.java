package davidch.leetcode.challenges.n49;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        final var result = solution.groupAnagrams(strs);

        assertThat(result).hasSize(3);
        assertThat(result).contains(List.of("bat"));
        assertThat(result).anySatisfy(element ->
                assertThat(element).containsExactlyInAnyOrder("nat", "tan")
        );
        assertThat(result).anySatisfy(element ->
                assertThat(element).containsExactlyInAnyOrder("ate", "eat", "tea")
        );
    }

    @Test
    void example_2() {
        final String[] strs = {""};
        final var result = solution.groupAnagrams(strs);

        assertThat(result).containsExactly(List.of(""));
    }

    @Test
    void example_3() {
        final String[] strs = {"a"};
        final var result = solution.groupAnagrams(strs);

        assertThat(result).containsExactly(List.of("a"));
    }
}