package davidch.leetcode.challenges.n2336;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SmallestInfiniteSetTest {

    @Test
    void example_1() {
        final var smallestInfiniteSet = new SmallestInfiniteSet();
        smallestInfiniteSet.addBack(2);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(1);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(2);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(3);
        smallestInfiniteSet.addBack(1);
        smallestInfiniteSet.addBack(1);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(1);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(4);
        assertThat(smallestInfiniteSet.popSmallest()).isEqualTo(5);
    }
}