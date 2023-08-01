package davidch.leetcode.challenges.n938;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(10, 5, 15, 3, 7, null, 18);
        final var result = solution.rangeSumBST(root, 7, 15);
        assertThat(result).isEqualTo(32);
    }

    @Test
    void example_2() {
        final var root = tree(10, 5, 15, 3, 7, 13, 18, 1, null, 6);
        final var result = solution.rangeSumBST(root, 6, 10);
        assertThat(result).isEqualTo(23);
    }
}