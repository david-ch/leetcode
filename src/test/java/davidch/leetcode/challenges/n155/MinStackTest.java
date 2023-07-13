package davidch.leetcode.challenges.n155;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinStackTest {

    @Test
    void example_1() {
        final var minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertThat(minStack.getMin()).isEqualTo(-3);
        minStack.pop();
        assertThat(minStack.top()).isEqualTo(0);
        assertThat(minStack.getMin()).isEqualTo(-2);
    }
}