package davidch.leetcode.challenges.n872;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root1 = tree(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4);
        final var root2 = tree(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8);
        final var result = solution.leafSimilar(root1, root2);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var root1 = tree(1, 2, 3);
        final var root2 = tree(1, 3, 2);
        final var result = solution.leafSimilar(root1, root2);
        assertThat(result).isFalse();
    }
}