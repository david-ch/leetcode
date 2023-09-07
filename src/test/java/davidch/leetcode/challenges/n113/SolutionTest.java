package davidch.leetcode.challenges.n113;

import org.junit.jupiter.api.Test;

import java.util.List;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1);
        final var result = solution.pathSum(root, 22);
        assertThat(result).isEqualTo(List.of(
                List.of(5, 4, 11, 2),
                List.of(5, 8, 4, 5)
        ));
    }

    @Test
    void example_2() {
        final var root = tree(1, 2, 3);
        final var result = solution.pathSum(root, 5);
        assertThat(result).isEmpty();
    }

    @Test
    void example_3() {
        final var root = tree(1, 2);
        final var result = solution.pathSum(root, 0);
        assertThat(result).isEmpty();
    }

    @Test
    void example_4() {
        final var root = tree(1, 2);
        final var result = solution.pathSum(root, 1);
        assertThat(result).isEmpty();
    }
}