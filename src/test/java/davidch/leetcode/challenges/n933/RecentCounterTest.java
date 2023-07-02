package davidch.leetcode.challenges.n933;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecentCounterTest {

    @Test
    void example_1() {
        final var counter = new RecentCounter();
        assertThat(counter.ping(1)).isEqualTo(1);
        assertThat(counter.ping(100)).isEqualTo(2);
        assertThat(counter.ping(3001)).isEqualTo(3);
        assertThat(counter.ping(3002)).isEqualTo(3);
    }
}