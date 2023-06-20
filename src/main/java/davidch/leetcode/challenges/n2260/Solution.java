package davidch.leetcode.challenges.n2260;

import java.util.HashMap;

public class Solution {
    public int minimumCardPickup(int[] cards) {
        final var cardsIndicies = new HashMap<Integer, Integer>();

        var result = -1;
        for (var i = 0; i < cards.length; i++) {
            final var matchingCardIdx = cardsIndicies.get(cards[i]);
            if (matchingCardIdx != null) {
                final var distance = i - matchingCardIdx + 1;
                if (result == -1 || distance < result) result = distance;
            }

            cardsIndicies.put(cards[i], i);
        }

        return result;
    }
}
