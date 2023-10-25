package davidch.leetcode.challenges.n786;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Comparator<Fraction> comparator = Comparator.comparing(f -> f.result);
        final var heap = new PriorityQueue<>(comparator.reversed());
        for (var a = 0; a < arr.length - 1; a++) {
            for (var b = a + 1; b < arr.length; b++) {
                heap.add(new Fraction(arr[a], arr[b], (double) arr[a] / arr[b]));
                if (heap.size() > k) heap.poll();
            }
        }

        final var result = heap.poll();
        return new int[]{result.a, result.b};
    }

    private record Fraction(int a, int b, double result) {
    }
}
