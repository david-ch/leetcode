package davidch.leetcode.challenges.n901;

import java.util.Stack;

class StockSpanner {

    private final Stack<DayRecord> decreasingMaximums = new Stack<>();
    private int currentDay = 1;

    public int next(int price) {
        while (!decreasingMaximums.empty() && price >= decreasingMaximums.peek().price) {
            decreasingMaximums.pop();
        }

        final var result = decreasingMaximums.empty() ? currentDay : currentDay - decreasingMaximums.peek().dayNumber;
        decreasingMaximums.push(new DayRecord(currentDay, price));
        currentDay++;

        return result;
    }

    private record DayRecord(int dayNumber, int price) {
    }
}