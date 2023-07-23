package davidch.leetcode.challenges.n111;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(3, 9, 20, null, null, 15, 7);
        final var result = solution.minDepth(root);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final var root = tree(2, null, 3, null, 4, null, 5, null, 6);
        final var result = solution.minDepth(root);
        assertThat(result).isEqualTo(5);
    }
}