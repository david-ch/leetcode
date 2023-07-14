package davidch.leetcode.challenges.n225;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyStackTest {

    @Test
    void example_1() {
        final var myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        assertThat(myStack.top()).isEqualTo(2);
        assertThat(myStack.pop()).isEqualTo(2);
        assertThat(myStack.empty()).isFalse();
    }
}