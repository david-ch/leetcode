package davidch.leetcode.challenges.n108;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {-10, -3, 0, 5, 9};
        final var result = solution.sortedArrayToBST(nums);
        assertThat(result).isEqualTo(tree(0, -3, 9, -10, null, 5));
    }

    @Test
    void example_2() {
        final int[] nums = {1, 3};
        final var result = solution.sortedArrayToBST(nums);
        assertThat(result).isEqualTo(tree(3, 1));
    }
}