package davidch.leetcode.challenges.n100;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var p = tree(1, 2, 3);
        final var q = tree(1, 2, 3);
        final var result = solution.isSameTree(p, q);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var p = tree(1, 2);
        final var q = tree(1, null, 2);
        final var result = solution.isSameTree(p, q);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var p = tree(1, 2, 1);
        final var q = tree(1, 1, 2);
        final var result = solution.isSameTree(p, q);
        assertThat(result).isFalse();
    }

}