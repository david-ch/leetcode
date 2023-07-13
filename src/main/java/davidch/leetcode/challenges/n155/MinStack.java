package davidch.leetcode.challenges.n155;

import java.util.Stack;

public class MinStack {

    private final Stack<Frame> frames = new Stack<>();

    public void push(int val) {
        frames.push(new Frame(
            val,
            frames.empty() ? val : Math.min(frames.peek().min, val)
        ));
    }

    public void pop() {
        frames.pop();
    }

    public int top() {
        return frames.peek().value;
    }

    public int getMin() {
        return frames.peek().min;
    }

    private record Frame(int value, int min) {
    }
}
