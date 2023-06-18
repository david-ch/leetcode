package davidch.leetcode.challenges.n2225;

import java.util.*;

public class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        final var playersLosses = new HashMap<Integer, Integer>();

        for (var i = 0; i < matches.length; i++) {
            playersLosses.put(matches[i][0], playersLosses.getOrDefault(matches[i][0], 0));
            playersLosses.put(matches[i][1], playersLosses.getOrDefault(matches[i][1], 0) + 1);
        }

        final var zeroLossPlayers = new ArrayList<Integer>();
        final var oneLossPlayers = new ArrayList<Integer>();
        for (var playerLosses : playersLosses.entrySet()) {
            if (playerLosses.getValue() == 0) {
                zeroLossPlayers.add(playerLosses.getKey());
            } else if (playerLosses.getValue() == 1) {
                oneLossPlayers.add(playerLosses.getKey());
            }
        }

        zeroLossPlayers.sort(Comparator.naturalOrder());
        oneLossPlayers.sort(Comparator.naturalOrder());

        return List.of(zeroLossPlayers, oneLossPlayers);
    }
}
