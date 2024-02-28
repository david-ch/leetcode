package davidch.leetcode.challenges.n513;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(2, 1, 3);
        final var result = solution.findBottomLeftValue(root);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final var root = tree(1, 2, 3, 4, null, 5, 6, null, null, 7);
        final var result = solution.findBottomLeftValue(root);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_3() {
        final var root = tree(1);
        final var result = solution.findBottomLeftValue(root);
        assertThat(result).isEqualTo(1);
    }
}