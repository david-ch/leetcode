package davidch.leetcode.challenges.n437;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1);
        final var result = solution.pathSum(root, 8);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var root = tree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1);
        final var result = solution.pathSum(root, 22);
        assertThat(result).isEqualTo(3);
    }
}