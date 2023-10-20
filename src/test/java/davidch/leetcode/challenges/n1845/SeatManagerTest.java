package davidch.leetcode.challenges.n1845;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SeatManagerTest {

    @Test
    void example_1() {
        final var seatManager = new SeatManager(5);
        assertThat(seatManager.reserve()).isEqualTo(1);
        assertThat(seatManager.reserve()).isEqualTo(2);
        seatManager.unreserve(2);
        assertThat(seatManager.reserve()).isEqualTo(2);
        assertThat(seatManager.reserve()).isEqualTo(3);
        assertThat(seatManager.reserve()).isEqualTo(4);
        assertThat(seatManager.reserve()).isEqualTo(5);
        seatManager.unreserve(5);
    }
}