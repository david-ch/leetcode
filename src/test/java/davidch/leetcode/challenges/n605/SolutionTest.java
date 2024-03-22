package davidch.leetcode.challenges.n605;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] flowerbed = {1, 0, 0, 0, 1};
        final var result = solution.canPlaceFlowers(flowerbed, 1);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] flowerbed = {1, 0, 0, 0, 1};
        final var result = solution.canPlaceFlowers(flowerbed, 2);
        assertThat(result).isFalse();
    }
}