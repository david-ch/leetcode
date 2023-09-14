package davidch.leetcode.challenges.n700;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(4, 2, 7, 1, 3);
        final var expectedResult = tree(2, 1, 3);
        final var result = solution.searchBST(root, 2);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final var root = tree(4, 2, 7, 1, 3);
        final var result = solution.searchBST(root, 5);
        assertThat(result).isNull();
    }
}