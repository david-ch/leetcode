package davidch.leetcode.challenges.n295;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    private final PriorityQueue<Integer> lesser = new PriorityQueue<>(Comparator.reverseOrder());
    private final PriorityQueue<Integer> greater = new PriorityQueue<>();

    public void addNum(int num) {
        greater.add(num);

        while (!lesser.isEmpty() && !greater.isEmpty() && greater.peek() < lesser.peek()) lesser.add(greater.poll());
        while (lesser.size() - greater.size() > 1) greater.add(lesser.poll());
        while (greater.size() - lesser.size() > 1) lesser.add(greater.poll());
    }

    public double findMedian() {
        if (lesser.size() > greater.size()) return lesser.peek();
        else if (greater.size() > lesser.size()) return greater.peek();
        else return (lesser.peek() + greater.peek()) / 2.0;
    }
}
