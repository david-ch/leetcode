package davidch.leetcode.challenges.n1161;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(1, 7, 0, 7, -8, null, null);
        final var result = solution.maxLevelSum(root);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final var root = tree(989, null, 10250, 98693, -89388, null, null, null, -32127);
        final var result = solution.maxLevelSum(root);
        assertThat(result).isEqualTo(2);
    }
}