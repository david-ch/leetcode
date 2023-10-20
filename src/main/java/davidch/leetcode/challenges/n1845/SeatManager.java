package davidch.leetcode.challenges.n1845;

import java.util.PriorityQueue;

class SeatManager {

    private final PriorityQueue<Integer> unreservedSeats = new PriorityQueue<>();
    private int nextToReserve = 1;

    public SeatManager(int n) {
    }

    public int reserve() {
        return (!unreservedSeats.isEmpty() && unreservedSeats.peek() < nextToReserve)
                ? unreservedSeats.poll()
                : nextToReserve++;
    }

    public void unreserve(int seatNumber) {
        unreservedSeats.offer(seatNumber);
    }
}
