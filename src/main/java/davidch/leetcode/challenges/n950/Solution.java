package davidch.leetcode.challenges.n950;

import java.util.Arrays;

public class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        final var result = new int[deck.length];

        var nextResultIdx = 0;
        for (var deckIdx = 0; deckIdx < deck.length; deckIdx++) {
            result[nextResultIdx] = deck[deckIdx];
            if (deckIdx == deck.length - 1) break;

            while (nextResultIdx < result.length && result[nextResultIdx] != 0) nextResultIdx++;
            if (nextResultIdx == result.length) {
                nextResultIdx = 0;
                while (result[nextResultIdx] != 0) nextResultIdx++;
            }
            nextResultIdx++;
            while (nextResultIdx < result.length && result[nextResultIdx] != 0) nextResultIdx++;
            if (nextResultIdx == result.length) {
                nextResultIdx = 0;
                while (result[nextResultIdx] != 0) nextResultIdx++;
            }
        }

        return result;
    }
}
