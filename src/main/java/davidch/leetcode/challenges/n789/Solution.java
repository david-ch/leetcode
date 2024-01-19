package davidch.leetcode.challenges.n789;

public class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        final var distToTarget = Math.abs(target[0]) + Math.abs(target[1]);
        if (distToTarget == 0) return true;

        for (var ghost: ghosts) {
            final var ghostDistToTarget = Math.abs(ghost[0] - target[0]) + Math.abs(ghost[1] - target[1]);
            if (ghostDistToTarget <= distToTarget) return false;
        }

        return true;
    }
}
