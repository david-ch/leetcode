package davidch.leetcode.challenges.n1325;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(1, 2, 3, 2, null, 2, 4);
        final var result = solution.removeLeafNodes(root, 2);
        assertThat(result).isEqualTo(tree(1, null, 3, null, 4));
    }

    @Test
    void example_2() {
        final var root = tree(1, 3, 3, 3, 2);
        final var result = solution.removeLeafNodes(root, 3);
        assertThat(result).isEqualTo(tree(1, 3, null, null, 2));
    }

    @Test
    void example_3() {
        final var root = tree(1, 2, null, 2, null, 2);
        final var result = solution.removeLeafNodes(root, 2);
        assertThat(result).isEqualTo(tree(1));
    }

    @Test
    void remove_all_nodes() {
        final var root = tree(1, 1, 1, 1);
        final var result = solution.removeLeafNodes(root, 1);
        assertThat(result).isNull();
    }
}