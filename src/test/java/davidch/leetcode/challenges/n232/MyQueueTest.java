package davidch.leetcode.challenges.n232;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyQueueTest {

    @Test
    void example_1() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        assertThat(myQueue.peek()).isEqualTo(1);
        assertThat(myQueue.pop()).isEqualTo(1);
        assertThat(myQueue.empty()).isEqualTo(false);
    }
}