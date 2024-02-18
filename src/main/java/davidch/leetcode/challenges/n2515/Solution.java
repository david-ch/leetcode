package davidch.leetcode.challenges.n2515;

public class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        for (var i = 0; i < words.length; i++) {
            if (words[(startIndex + i) % words.length].equals(target)) return i;
            if (i <= startIndex && words[(startIndex - i)].equals(target)) return i;
            if (i > startIndex && words[words.length + startIndex - i].equals(target)) return i;
        }

        return -1;
    }
}
