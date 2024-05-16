package davidch.leetcode.challenges.n2331;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(2, 1, 3, null, null, 0, 1);
        final var result = solution.evaluateTree(root);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var root = tree(0);
        final var result = solution.evaluateTree(root);
        assertThat(result).isFalse();
    }
}