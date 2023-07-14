package davidch.leetcode.challenges.n225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private final Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.offer(x);

        final var elementsToMove = queue.size() - 1;
        for (var i = 0; i < elementsToMove; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}