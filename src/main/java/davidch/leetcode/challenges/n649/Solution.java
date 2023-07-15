package davidch.leetcode.challenges.n649;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String predictPartyVictory(String senate) {
        final Queue<Integer> rSenatorsIndexes = new LinkedList<>();
        final Queue<Integer> dSenatorsIndexes = new LinkedList<>();

        final var len = senate.length();
        for (var i = 0; i < len; i++) {
            (senate.charAt(i) == 'R' ? rSenatorsIndexes : dSenatorsIndexes)
                    .offer(i);
        }

        var nextSenatorIdx = len;
        while (!rSenatorsIndexes.isEmpty() && !dSenatorsIndexes.isEmpty()) {
            (rSenatorsIndexes.poll() < dSenatorsIndexes.poll() ? rSenatorsIndexes : dSenatorsIndexes)
                    .offer(nextSenatorIdx++);
        }

        return rSenatorsIndexes.isEmpty() ? "Dire" : "Radiant";
    }
}
