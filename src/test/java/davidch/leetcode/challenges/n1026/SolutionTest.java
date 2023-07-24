package davidch.leetcode.challenges.n1026;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(8, 3, 10, 1, 6, null, 14, null, null, 4, 7, 13);
        final var result = solution.maxAncestorDiff(root);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_2() {
        final var root = tree(1, null, 2, null, 0, 3);
        final var result = solution.maxAncestorDiff(root);
        assertThat(result).isEqualTo(3);
    }
}