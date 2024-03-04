package davidch.leetcode.challenges.n948;

import java.util.Arrays;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        var score = 0;
        var left = 0;
        var right = tokens.length - 1;

        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left];
                score++;
                left++;
            } else if (score > 0 && tokens[right] > tokens[left] && right != left) {
                power += tokens[right];
                score--;
                right--;
            } else break;
        }

        return score;
    }
}
