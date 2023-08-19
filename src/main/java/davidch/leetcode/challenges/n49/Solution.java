package davidch.leetcode.challenges.n49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        final var groups = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            final var key = strs[i].toCharArray();
            Arrays.sort(key);

            final var group = groups.computeIfAbsent(new String(key), k -> new ArrayList<>());
            group.add(strs[i]);
        }

        return new ArrayList<>(groups.values());
    }
}
