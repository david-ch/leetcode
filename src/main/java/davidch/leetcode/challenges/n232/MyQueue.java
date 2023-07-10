package davidch.leetcode.challenges.n232;

import java.util.Stack;

public class MyQueue {

    private final Stack<Integer> inbox = new Stack<>();
    private final Stack<Integer> outbox = new Stack<>();

    public void push(int x) {
        inbox.push(x);
    }

    public int pop() {
        if (outbox.empty()) fillOutbox();
        return outbox.pop();
    }

    public int peek() {
        if (outbox.empty()) fillOutbox();
        return outbox.peek();
    }

    public boolean empty() {
        return inbox.empty() && outbox.empty();
    }

    private void fillOutbox() {
        while (!inbox.empty()) outbox.push(inbox.pop());
    }
}
