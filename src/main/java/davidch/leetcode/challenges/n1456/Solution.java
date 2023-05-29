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

//    public int maxVowels(String s, int k) {
//        var result = 0;
//        var vowelsInWindow = 0;
//
//        var left = 0;
//        for (var right = 0; right < s.length(); right++) {
//            if (isVowel(s.charAt(right))) {
//                vowelsInWindow++;
//            }
//
//            if (k == 0) {
//                if (isVowel(s.charAt(left))) {
//                    vowelsInWindow--;
//                }
//                left++;
//            } else {
//              k--;
//            }
//
//            result = Math.max(result, vowelsInWindow);
//        }
//
//        return result;
//    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
