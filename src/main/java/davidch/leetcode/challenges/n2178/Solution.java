package davidch.leetcode.challenges.n2178;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if (finalSum % 2 == 1) return List.of();

        final var result = new ArrayList<Long>();
        var currentNum = 2L;
        while (finalSum > 0) {
            result.add(currentNum);
            finalSum -= currentNum;
            currentNum += 2;
        }

        if (finalSum < 0) result.remove((int) (-finalSum / 2) - 1);

        return result;
    }
}
