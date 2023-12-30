package davidch.leetcode.challenges.n1897;

public class Solution {
    public boolean makeEqual(String[] words) {
        final var charCount = new int['z' - 'a' + 1];
        for (var word : words)
            for (var ch : word.toCharArray())
                charCount[ch - 'a']++;

        for (var cnt : charCount)
            if (cnt % words.length != 0)
                return false;

        return true;
    }
}
