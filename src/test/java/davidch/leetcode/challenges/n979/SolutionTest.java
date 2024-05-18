package davidch.leetcode.challenges.n979;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void example_1() {
        final var solution = new Solution();
        final var root = tree(3, 0, 0);
        final var result = solution.distributeCoins(root);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final var solution = new Solution();
        final var root = tree(0, 3, 0);
        final var result = solution.distributeCoins(root);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final var solution = new Solution();
        final var root = tree(1, 2, 1, 2, 0, 1, 0);
        final var result = solution.distributeCoins(root);
        assertThat(result).isEqualTo(5);
    }
}