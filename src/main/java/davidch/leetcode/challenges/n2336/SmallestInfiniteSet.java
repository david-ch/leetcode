package davidch.leetcode.challenges.n2336;

import java.util.PriorityQueue;

public class SmallestInfiniteSet {

    private final PriorityQueue<Integer> addedBack = new PriorityQueue<>();
    private int nextToRemove = 1;

    public SmallestInfiniteSet() {
    }

    public int popSmallest() {
        return (!addedBack.isEmpty() && addedBack.peek() <= nextToRemove)
            ? addedBack.poll()
            : nextToRemove++;
    }

    public void addBack(int num) {
        if (num >= nextToRemove || addedBack.contains(num)) return;
        addedBack.offer(num);
    }
}
