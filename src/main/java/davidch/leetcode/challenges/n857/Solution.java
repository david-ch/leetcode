package davidch.leetcode.challenges.n857;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        final var workers = new Worker[quality.length];
        for (var i = 0; i < quality.length; i++)
            workers[i] = new Worker(quality[i], wage[i], (double) wage[i] / quality[i]);
        Arrays.sort(workers, (w1, w2) -> Double.compare(w1.rate, w2.rate));

        var totalQuality = 0;
        var result = Double.MAX_VALUE;
        final var paidGroup = new PriorityQueue<Integer>((i1, i2) -> workers[i2].quality - workers[i1].quality);

        for (var i = 0; i < quality.length; i++) {
            totalQuality += workers[i].quality;
            paidGroup.add(i);

            if (paidGroup.size() > k) totalQuality -= workers[paidGroup.poll()].quality;
            if (paidGroup.size() == k) result = Math.min(result, totalQuality * workers[i].rate);
        }

        return result;
    }

    record Worker(int quality, int wage, double rate) {
    }
}
