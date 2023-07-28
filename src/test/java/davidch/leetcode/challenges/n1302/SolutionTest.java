package davidch.leetcode.challenges.n1302;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8);
        final var result = solution.deepestLeavesSum(root);
        assertThat(result).isEqualTo(15);
    }

    @Test
    void example_2() {
        final var root = tree(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5);
        final var result = solution.deepestLeavesSum(root);
        assertThat(result).isEqualTo(19);
    }
}