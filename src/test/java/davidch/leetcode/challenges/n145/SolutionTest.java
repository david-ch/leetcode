package davidch.leetcode.challenges.n145;

import org.junit.jupiter.api.Test;

import java.util.List;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(1, null, 2, 3);
        final var result = solution.postorderTraversal(root);
        assertThat(result).isEqualTo(List.of(3, 2, 1));
    }

    @Test
    void example_2() {
        final var result = solution.postorderTraversal(null);
        assertThat(result).isEqualTo(List.of());
    }

    @Test
    void example_3() {
        final var root = tree(1);
        final var result = solution.postorderTraversal(root);
        assertThat(result).isEqualTo(List.of(1));
    }
}