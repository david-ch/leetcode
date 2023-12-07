package davidch.leetcode.challenges.n88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var i1 = m - 1;
        var i2 = n - 1;

        for (var i = nums1.length - 1; i >= 0; i--) {
            if (i2 == -1 || (i1 != -1 && nums1[i1] >= nums2[i2])) {
                nums1[i] = nums1[i1];
                i1--;
            }
            else {
                nums1[i] = nums2[i2];
                i2--;
            }
        }
    }
}
