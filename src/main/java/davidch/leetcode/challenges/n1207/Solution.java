package davidch.leetcode.challenges.n1207;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        final var numbersOccurrences = new HashMap<Integer, Integer>();
        for (var i = 0; i < arr.length; i++) {
            numbersOccurrences.put(arr[i], numbersOccurrences.getOrDefault(arr[i], 0) + 1);
        }

        return numbersOccurrences.values().size() == new HashSet<>(numbersOccurrences.values()).size();
    }
}
