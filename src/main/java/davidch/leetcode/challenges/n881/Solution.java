package davidch.leetcode.challenges.n881;

import java.util.Arrays;

public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        var boats = 0;
        var left = 0;
        var right = people.length - 1;
        while (left <= right) {
            if (people[left] + people[right] <= limit) left++;
            right--;
            boats++;
        }

        return boats;
    }
}
