package davidch.leetcode.challenges.n637;

import org.junit.jupiter.api.Test;

import java.util.List;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(3, 9, 20, null, null, 15, 7);
        final var result = solution.averageOfLevels(root);
        assertThat(result).isEqualTo(List.of(3., 14.5, 11.));
    }

    @Test
    void example_2() {
        final var root = tree(3, 9, 20, 15, 7);
        final var result = solution.averageOfLevels(root);
        assertThat(result).isEqualTo(List.of(3., 14.5, 11.));
    }
}