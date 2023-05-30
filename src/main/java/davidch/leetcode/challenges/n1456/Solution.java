package davidch.leetcode.challenges.n1456;

public class Solution {

    public int maxVowels(String s, int k) {
        var vowelsInWindow = 0;
        for (var i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelsInWindow++;
            }
        }

        var result = vowelsInWindow;
        for (var i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelsInWindow++;
            }

            if (isVowel(s.charAt(i - k))) {
                vowelsInWindow--;
            }

            result = Math.max(result, vowelsInWindow);
        }

        return result;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
