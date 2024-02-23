package davidch.leetcode.challenges.n787;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void example_1() {
        final int[][] flights = {
                {0, 1, 100},
                {1, 2, 100},
                {2, 0, 100},
                {1, 3, 600},
                {2, 3, 200}
        };
        final var result = new Solution().findCheapestPrice(4, flights, 0, 3, 1);
        assertThat(result).isEqualTo(700);
    }

    @Test
    void example_2() {
        final int[][] flights = {
                {0, 1, 100},
                {1, 2, 100},
                {0, 2, 500}
        };
        final var result = new Solution().findCheapestPrice(3, flights, 0, 2, 1);
        assertThat(result).isEqualTo(200);
    }

    @Test
    void example_3() {
        final int[][] flights = {
                {0, 1, 100},
                {1, 2, 100},
                {0, 2, 500}
        };
        final var result = new Solution().findCheapestPrice(3, flights, 0, 2, 0);
        assertThat(result).isEqualTo(500);
    }

    @Test
    void example_4() {
        final int[][] flights = {
                {4,1,1},
                {1,2,3},
                {0,3,2},
                {0,4,10},
                {3,1,1},
                {1,4,3}
        };
        final var result = new Solution().findCheapestPrice(5, flights, 2, 1, 1);
        assertThat(result).isEqualTo(-1);
    }
}