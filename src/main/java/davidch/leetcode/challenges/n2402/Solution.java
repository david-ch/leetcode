package davidch.leetcode.challenges.n2402;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(meeting -> meeting[0]));
        final var roomsUsages = new int[n];
        final var roomOccupied = new boolean[n];

        final Comparator<OngoingMeeting> comparingByEndTime = Comparator.comparing(meeting -> meeting.endsAt);
        final var ongoingMeetings = new PriorityQueue<>(comparingByEndTime.thenComparing(meeting -> meeting.room));

        for (var i = 0; i < meetings.length; i++) {
            while (!ongoingMeetings.isEmpty() && ongoingMeetings.peek().endsAt <= meetings[i][0]) {
                roomOccupied[ongoingMeetings.poll().room] = false;
            }

            var freeRoom = -1;
            for (var room = 0; room < n; room++) {
                if (!roomOccupied[room]) {
                    freeRoom = room;
                    break;
                }
            }

            long endTime = meetings[i][1];
            if (freeRoom == -1) {
                final var next = ongoingMeetings.poll();
                freeRoom = next.room;
                endTime = next.endsAt + meetings[i][1] - meetings[i][0];
            }

            roomsUsages[freeRoom]++;
            roomOccupied[freeRoom] = true;
            ongoingMeetings.offer(new OngoingMeeting(freeRoom, endTime));
        }

        var mostUsedRoom = 0;
        for (var i = 0; i < roomsUsages.length; i++) {
            if (roomsUsages[i] > roomsUsages[mostUsedRoom]) mostUsedRoom = i;
        }

        return mostUsedRoom;
    }

    private record OngoingMeeting(int room, long endsAt) {
    }
}
