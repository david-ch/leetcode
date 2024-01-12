package davidch.leetcode.challenges.n1704;

public class Solution {

    private static final String WOVELS = "aeiouAEIOU";

    public boolean halvesAreAlike(String s) {
        final var mid = s.length() / 2;
        var leftHalfVowels = 0;
        for (var i = 0; i < mid; i++)
            if (WOVELS.indexOf(s.charAt(i)) != -1)
                leftHalfVowels++;

        for (var i = mid; i < s.length(); i++)
            if (WOVELS.indexOf(s.charAt(i)) != -1) {
                leftHalfVowels--;
                if (leftHalfVowels < 0) return false;
            }

        return leftHalfVowels == 0;
    }
}
