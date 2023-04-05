package davidch.leetcode.challenges.n2327;

public class Solution {

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        final var peopleByAge = new ShiftableIntArray(forget);
        peopleByAge.setFirst(1);

        for (var day = 1; day < n; day++) {
            peopleByAge.shift();
            peopleByAge.setFirst(peopleByAge.sumElementsStartingFrom(delay));
        }


        return peopleByAge.sumElementsStartingFrom(0);
    }

    private static class ShiftableIntArray {

        public static final int MODULO = (int) Math.pow(10, 9) + 7;
        private final int[] data;
        private int offset;

        private ShiftableIntArray(int size) {
            data = new int[size];
            offset = 0;
        }

        private void shift() {
            offset--;
            if (offset == -1) {
                offset = data.length - 1;
            }
        }

        private void setFirst(int val) {
            data[offset] = val;
        }

        private int sumElementsStartingFrom(int start) {
            var sum = 0;

            for (var i = offset + start; i < data.length; i++) {
                sum += data[i];
                sum %= MODULO;
            }

            for (var i = Math.max(0, offset + start - data.length); i < offset; i++) {
                sum += data[i];
                sum %= MODULO;
            }

            return sum;
        }
    }
}
