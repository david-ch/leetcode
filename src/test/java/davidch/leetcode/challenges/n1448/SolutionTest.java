package davidch.leetcode.challenges.n1448;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(3, 1, 4, 3, null, 1, 5);
        final var result = solution.goodNodes(root);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var root = tree(3, 3, null, 4, 2);
        final var result = solution.goodNodes(root);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final var root = tree(1);
        final var result = solution.goodNodes(root);
        assertThat(result).isEqualTo(1);
    }
}