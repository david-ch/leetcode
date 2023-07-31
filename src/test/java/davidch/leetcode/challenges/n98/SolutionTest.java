package davidch.leetcode.challenges.n98;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(2, 1, 3);
        final var result = solution.isValidBST(root);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var root = tree(5, 1, 4, null, null, 3, 6);
        final var result = solution.isValidBST(root);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var root = tree(5, 4, 6, null, null, 3, 7);
        final var result = solution.isValidBST(root);
        assertThat(result).isFalse();
    }

    @Test
    void example_4() {
        final var root = tree(2147483647);
        final var result = solution.isValidBST(root);
        assertThat(result).isTrue();
    }

}