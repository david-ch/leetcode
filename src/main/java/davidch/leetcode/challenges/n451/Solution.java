package davidch.leetcode.challenges.n451;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String frequencySort(String s) {
        final var charCounts = new HashMap<Character, Integer>();

        final var stringLen = s.length();
        for (var i = 0; i < stringLen; i++) {
            final var ch = s.charAt(i);
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }

        final var result = new char[stringLen];
        var resultIdx = 0;

        final var sortedCharsCounts = charCounts.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList();
        for (var i = 0; i < sortedCharsCounts.size(); i++) {
            final var charCount = sortedCharsCounts.get(i);
            final var fillTillIdx = resultIdx + charCount.getValue();
            while (resultIdx < fillTillIdx) {
                result[resultIdx] = charCount.getKey();
                resultIdx++;
            }
        }

        return new String(result);
    }
}
