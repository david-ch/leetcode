package davidch.leetcode.challenges.n303;

class NumArray {

    private final int[] runningSum;

    public NumArray(int[] nums) {
        runningSum = new int[nums.length + 1];
        runningSum[0] = 0;
        for (var i = 0; i < nums.length; i++) {
            runningSum[i + 1] = runningSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return runningSum[right + 1] - runningSum[left];
    }
}
