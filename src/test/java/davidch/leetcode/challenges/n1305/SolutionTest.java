package davidch.leetcode.challenges.n1305;

import org.junit.jupiter.api.Test;

import java.util.List;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root1 = tree(2, 1, 4);
        final var root2 = tree(1, 0, 3);
        final var result = solution.getAllElements(root1, root2);
        assertThat(result).isEqualTo(List.of(0, 1, 1, 2, 3, 4));
    }

    @Test
    void example_2() {
        final var root1 = tree(1, null, 8);
        final var root2 = tree(8, 1);
        final var result = solution.getAllElements(root1, root2);
        assertThat(result).isEqualTo(List.of(1, 1, 8, 8));
    }
}