package davidch.leetcode.challenges.n129;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(1, 2, 3);
        final var result = solution.sumNumbers(root);
        assertThat(result).isEqualTo(25);
    }

    @Test
    void example_2() {
        final var root = tree(4, 9, 0, 5, 1);
        final var result = solution.sumNumbers(root);
        assertThat(result).isEqualTo(1026);
    }
}