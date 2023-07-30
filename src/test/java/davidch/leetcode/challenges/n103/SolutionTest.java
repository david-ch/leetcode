package davidch.leetcode.challenges.n103;

import org.junit.jupiter.api.Test;

import java.util.List;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(3, 9, 20, null, null, 15, 7);
        final var expectedResult = List.of(
                List.of(3),
                List.of(20, 9),
                List.of(15, 7)
        );
        final var result = solution.zigzagLevelOrder(root);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final var root = tree(1);
        final var expectedResult = List.of(
                List.of(1)
        );
        final var result = solution.zigzagLevelOrder(root);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final var root = tree();
        final var expectedResult = List.of();
        final var result = solution.zigzagLevelOrder(root);
        assertThat(result).isEqualTo(expectedResult);
    }
}