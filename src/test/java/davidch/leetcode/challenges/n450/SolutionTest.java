package davidch.leetcode.challenges.n450;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(5, 3, 6, 2, 4, null, 7);
        final var expectedResult = tree(5, 4, 6, 2, null, null, 7);
        final var result = solution.deleteNode(root, 3);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final var root = tree(5, 3, 6, 2, 4, null, 7);
        final var result = solution.deleteNode(root, 0);
        assertThat(result).isEqualTo(root);
    }

    @Test
    void example_3() {
        final var result = solution.deleteNode(null, 0);
        assertThat(result).isNull();
    }

    @Test
    void remove_root() {
        final var root = tree(5, 3, 6, 2, 4, null, 7);
        final var expectedResult = tree(6, 3, 7, 2, 4);
        final var result = solution.deleteNode(root, 5);
        assertThat(result).isEqualTo(expectedResult);
    }
}