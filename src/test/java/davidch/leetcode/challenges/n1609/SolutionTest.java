package davidch.leetcode.challenges.n1609;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2);
        final var result = solution.isEvenOddTree(root);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var root = tree(5, 4, 2, 3, 3, 7);
        final var result = solution.isEvenOddTree(root);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var root = tree(5, 9, 1, 3, 5, 7);
        final var result = solution.isEvenOddTree(root);
        assertThat(result).isFalse();
    }
}