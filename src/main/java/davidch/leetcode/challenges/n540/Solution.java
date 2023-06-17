package davidch.leetcode.challenges.n540;

public class Solution {

    public int singleNonDuplicate(int[] nums) {
        return singleNonDuplicate(nums, 0, nums.length - 1);
    }

    public int singleNonDuplicate(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }

        int middle = (start + end) / 2;

        if (middle % 2 == 0) {
            if (nums[middle + 1] == nums[middle]) {
                return singleNonDuplicate(nums, middle + 2, end);
            }
            else {
                return singleNonDuplicate(nums, start, middle);
            }
        }
        else {
            if (nums[middle - 1] == nums[middle]) {
                return singleNonDuplicate(nums, middle + 1, end);
            }
            else {
                return singleNonDuplicate(nums, start, middle);
            }
        }
    }
}
