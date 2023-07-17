package davidch.leetcode.challenges.n112;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.leaf;
import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(
                5,
                tree(4,
                        tree(11, leaf(7), leaf(2)),
                        null
                ),
                tree(8,
                        leaf(13),
                        tree(4, null, leaf(1))
                )
        );

        final var result = solution.hasPathSum(root, 22);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var root = tree(1, leaf(2), leaf(3));

        final var result = solution.hasPathSum(root, 5);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var result = solution.hasPathSum(null, 0);
        assertThat(result).isFalse();
    }

    @Test
    void example_4() {
        final var root = tree(1, leaf(2), null);

        final var result = solution.hasPathSum(root, 1);
        assertThat(result).isFalse();
    }
}