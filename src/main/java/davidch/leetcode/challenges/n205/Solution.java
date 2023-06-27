package davidch.leetcode.challenges.n205;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        final var sCharsMapping = new HashMap<Character, Character>();
        final var mappedTChars = new HashSet<Character>();

        final var len = s.length();
        for (var i = 0; i < len; i++) {
            final var fromCh = s.charAt(i);
            final var toChar = t.charAt(i);

            final var existingMapping = sCharsMapping.get(fromCh);
            if (existingMapping == null) {
                if (mappedTChars.contains(toChar)) return false;
            } else {
                if (!existingMapping.equals(toChar)) return false;
            }

            sCharsMapping.put(fromCh, toChar);
            mappedTChars.add(toChar);
        }

        return true;
    }
}
