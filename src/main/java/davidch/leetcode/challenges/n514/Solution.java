package davidch.leetcode.challenges.n514;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int findRotateSteps(String ring, String key) {
        final var ringChars = ring.toCharArray();
        final var keyChars = key.toCharArray();


        final var ringCharsPositions = new ArrayList<List<Integer>>();
        for (var i = 0; i < 26; i++) ringCharsPositions.add(new ArrayList<>());
        for (var i = 0; i < ringChars.length; i++) ringCharsPositions.get(ringChars[i] - 'a').add(i);

        final var result = new int[keyChars.length][ringChars.length];
        return findRotateSteps(ringCharsPositions, keyChars, ringChars.length, 0, 0, result);
    }

    private int findRotateSteps(ArrayList<List<Integer>> ring, char[] key, int ringLen, int ringPos, int keyPos, int[][] result) {
        if (keyPos == key.length) return 0;
        if (result[keyPos][ringPos] > 0) return result[keyPos][ringPos] - 1;

        var currentResult = Integer.MAX_VALUE;
        for (var option : ring.get(key[keyPos] - 'a')) {
            final var stepsToOptionMovingRight = option >= ringPos ? option - ringPos : (ringLen - ringPos + option);
            final var stepsToOptionMovingLeft = option <= ringPos ? ringPos - option : (ringPos + ringLen - option);

            currentResult = Math.min(
                currentResult,
                1 + Math.min(stepsToOptionMovingLeft, stepsToOptionMovingRight) + findRotateSteps(ring, key, ringLen, option, keyPos + 1, result)
            );
        }

        result[keyPos][ringPos] = currentResult + 1;
        return currentResult;
    }
}
