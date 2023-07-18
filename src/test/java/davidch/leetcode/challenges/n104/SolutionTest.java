package davidch.leetcode.challenges.n104;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(3, 9, 20, null, null, 15, 7);
        final var result = solution.maxDepth(root);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var root = tree(1, null, 2);
        final var result = solution.maxDepth(root);
        assertThat(result).isEqualTo(2);
    }
}