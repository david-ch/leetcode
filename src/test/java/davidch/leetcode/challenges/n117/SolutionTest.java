package davidch.leetcode.challenges.n117;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var n7 = new Solution.Node(7);
        final var n5 = new Solution.Node(5);
        final var n4 = new Solution.Node(4);
        final var n3 = new Solution.Node(3);
        final var n2 = new Solution.Node(2);
        final var n1 = new Solution.Node(1);

        n3.right = n7;
        n2.left = n4;
        n2.right = n5;
        n1.left = n2;
        n1.right = n3;

        final var result = solution.connect(n1);
        assertThat(result.val).isEqualTo(1);
        assertThat(n1.next).isNull();
        assertThat(n2.next).isSameAs(n3);
        assertThat(n3.next).isNull();
        assertThat(n4.next).isSameAs(n5);
        assertThat(n5.next).isSameAs(n7);
        assertThat(n7.next).isNull();
    }

    @Test
    void example_2() {
        final var result = solution.connect(null);
        assertThat(result).isNull();
    }

    @Test
    void example_3() {
        final var n1 = new Solution.Node(1);
        final var n2 = new Solution.Node(2);
        final var n3 = new Solution.Node(3);
        final var n4 = new Solution.Node(4);
        final var n5 = new Solution.Node(5);
        final var n6 = new Solution.Node(6);
        final var n7 = new Solution.Node(7);
        final var n8 = new Solution.Node(8);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.left = n7;
        n3.right = n6;
        n6.right = n8;

        final var result = solution.connect(n1);
        assertThat(result.val).isEqualTo(1);
        assertThat(n1.next).isNull();
        assertThat(n2.next).isSameAs(n3);
        assertThat(n3.next).isNull();
        assertThat(n4.next).isSameAs(n5);
        assertThat(n5.next).isSameAs(n6);
        assertThat(n6.next).isNull();
        assertThat(n7.next).isSameAs(n8);
        assertThat(n8.next).isNull();

    }
}