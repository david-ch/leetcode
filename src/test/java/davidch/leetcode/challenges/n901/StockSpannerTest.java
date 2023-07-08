package davidch.leetcode.challenges.n901;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StockSpannerTest {

    @Test
    void example_1() {
        final var stockSpanner = new StockSpanner();
        assertThat(stockSpanner.next(100)).isEqualTo(1);
        assertThat(stockSpanner.next(80)).isEqualTo(1);
        assertThat(stockSpanner.next(60)).isEqualTo(1);
        assertThat(stockSpanner.next(70)).isEqualTo(2);
        assertThat(stockSpanner.next(60)).isEqualTo(1);
        assertThat(stockSpanner.next(75)).isEqualTo(4);
        assertThat(stockSpanner.next(85)).isEqualTo(6);
    }

    @Test
    void example_2() {
        final var stockSpanner = new StockSpanner();
        assertThat(stockSpanner.next(31)).isEqualTo(1);
        assertThat(stockSpanner.next(41)).isEqualTo(2);
        assertThat(stockSpanner.next(48)).isEqualTo(3);
        assertThat(stockSpanner.next(59)).isEqualTo(4);
        assertThat(stockSpanner.next(79)).isEqualTo(5);
    }

    @Test
    void example_3() {
        final var stockSpanner = new StockSpanner();
        assertThat(stockSpanner.next(28)).isEqualTo(1);
        assertThat(stockSpanner.next(14)).isEqualTo(1);
        assertThat(stockSpanner.next(28)).isEqualTo(3);
        assertThat(stockSpanner.next(35)).isEqualTo(4);
        assertThat(stockSpanner.next(46)).isEqualTo(5);
        assertThat(stockSpanner.next(53)).isEqualTo(6);
        assertThat(stockSpanner.next(66)).isEqualTo(7);
        assertThat(stockSpanner.next(80)).isEqualTo(8);
        assertThat(stockSpanner.next(87)).isEqualTo(9);
        assertThat(stockSpanner.next(88)).isEqualTo(10);
    }
}