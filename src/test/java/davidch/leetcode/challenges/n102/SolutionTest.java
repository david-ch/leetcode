package davidch.leetcode.challenges.n102;

import org.junit.jupiter.api.Test;

import java.util.List;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(3, 9, 20, null, null, 15, 7);
        final var result = solution.levelOrder(root);
        assertThat(result).isEqualTo(List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        ));
    }

    @Test
    void example_2() {
        final var root = tree(1);
        final var result = solution.levelOrder(root);
        assertThat(result).isEqualTo(List.of(
                List.of(1)
        ));
    }

    @Test
    void example_3() {
        final var result = solution.levelOrder(null);
        assertThat(result).isEqualTo(List.of());
    }
}