package davidch.leetcode.challenges.n383;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        final var availableCharsNumbers = new int[26];

        for (char ch : magazine.toCharArray()) {
            availableCharsNumbers[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (--availableCharsNumbers[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
