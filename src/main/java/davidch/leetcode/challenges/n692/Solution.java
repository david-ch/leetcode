package davidch.leetcode.challenges.n692;

import java.util.*;

public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        final var wordFreq = new HashMap<String, Integer>();
        for (var w : words) {
            wordFreq.put(w, wordFreq.getOrDefault(w, 0) + 1);
        }

        final Comparator<String> comparingByFrequency = Comparator.comparing(wordFreq::get);
        final Comparator<String> comparingLexicographically = Comparator.comparing(s -> s);
        final var heap = new PriorityQueue<>(comparingByFrequency.thenComparing(comparingLexicographically.reversed()));
        for (var w : wordFreq.keySet()) {
            heap.offer(w);
            if (heap.size() > k) heap.poll();
        }

        final var result = new String[k];
        for (var i = k - 1; i >= 0; i--) result[i] = heap.poll();
        return Arrays.asList(result);
    }
}
