package davidch.leetcode.challenges.n295;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MedianFinderTest {

    @Test
    void example_1() {
        final var medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        assertThat(medianFinder.findMedian()).isEqualTo(1.5);
        medianFinder.addNum(3);
        assertThat(medianFinder.findMedian()).isEqualTo(2.0);
    }

    @Test
    void example_2() {
        final var medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        assertThat(medianFinder.findMedian()).isEqualTo(-1.0);
        medianFinder.addNum(-2);
        assertThat(medianFinder.findMedian()).isEqualTo(-1.5);
        medianFinder.addNum(-3);
        assertThat(medianFinder.findMedian()).isEqualTo(-2.0);
        medianFinder.addNum(-4);
        assertThat(medianFinder.findMedian()).isEqualTo(-2.5);
        medianFinder.addNum(-5);
        assertThat(medianFinder.findMedian()).isEqualTo(-3.0);

    }
}