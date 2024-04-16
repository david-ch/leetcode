package davidch.leetcode.challenges.n623;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(4, 2, 6, 3, 1, 5);
        final var result = solution.addOneRow(root, 1, 2);
        assertThat(result).isEqualTo(tree(4, 1, 1, 2, null, null, 6, 3, 1, 5));
    }

    @Test
    void example_2() {
        final var root = tree(4, 2, null, 3, 1);
        final var result = solution.addOneRow(root, 1, 3);
        assertThat(result).isEqualTo(tree(4, 2, null, 1, 1, 3, null, null, 1));
    }

    @Test
    void example_3() {
        final var root = tree(4, null, 2);
        final var result = solution.addOneRow(root, 1, 1);
        assertThat(result).isEqualTo(tree(1, 4, null, null, 2));
    }
}