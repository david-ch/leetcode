package davidch.leetcode.challenges.n988;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void example_1() {
        final var solution = new Solution();
        final var root = tree(0, 1, 2, 3, 4, 3, 4);
        final var result = solution.smallestFromLeaf(root);
        assertThat(result).isEqualTo("dba");
    }

    @Test
    void example_2() {
        final var solution = new Solution();
        final var root = tree(25, 1, 3, 1, 3, 0, 2);
        final var result = solution.smallestFromLeaf(root);
        assertThat(result).isEqualTo("adz");
    }

    @Test
    void example_3() {
        final var solution = new Solution();
        final var root = tree(2, 2, 1, null, 1, 0, null, 0);
        final var result = solution.smallestFromLeaf(root);
        assertThat(result).isEqualTo("abc");
    }

    @Test
    void example_4() {
        final var solution = new Solution();
        final var root = tree(3, 9, 20, null, null, 15, 7);
        final var result = solution.smallestFromLeaf(root);
        assertThat(result).isEqualTo("hud");
    }

    @Test
    void example_5() {
        final var solution = new Solution();
        final var root = tree(4, 0, 1, 1);
        final var result = solution.smallestFromLeaf(root);
        assertThat(result).isEqualTo("bae");
    }

    @Test
    void example_6() {
        final var solution = new Solution();
        final var root = tree(25, 1, null, 0, 0, 1, null, null, null, 0);
        final var result = solution.smallestFromLeaf(root);
        assertThat(result).isEqualTo("ababz");
    }
}