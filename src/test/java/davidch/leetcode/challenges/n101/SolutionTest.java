package davidch.leetcode.challenges.n101;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(1,2,2,3,4,4,3);
        final var result = solution.isSymmetric(root);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var root = tree(1,2,2,null,3,null,3);
        final var result = solution.isSymmetric(root);
        assertThat(result).isFalse();
    }
}