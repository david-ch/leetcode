package davidch.leetcode.challenges.n199;

import org.junit.jupiter.api.Test;

import java.util.List;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(1, 2, 3, null, 5, null, 4);
        final var expectedResult = List.of(1, 3, 4);
        final var result = solution.rightSideView(root);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final var root = tree(1, null, 3);
        final var expectedResult = List.of(1, 3);
        final var result = solution.rightSideView(root);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final var root = tree();
        final var expectedResult = List.of();
        final var result = solution.rightSideView(root);
        assertThat(result).isEqualTo(expectedResult);
    }
}