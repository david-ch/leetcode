package davidch.leetcode.challenges.n841;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        final var roomsNum = rooms.size();
        final var unlocked = new boolean[roomsNum];
        var lockedRoomsNum = roomsNum;

        final Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        unlocked[0] = true;
        lockedRoomsNum--;

        while (!queue.isEmpty() && lockedRoomsNum > 0) {
            final var room = queue.poll();
            for (var key : rooms.get(room)) {
                if (!unlocked[key]) {
                    queue.offer(key);
                    unlocked[key] = true;
                    lockedRoomsNum--;
                }
            }
        }

        return lockedRoomsNum == 0;
    }
}
