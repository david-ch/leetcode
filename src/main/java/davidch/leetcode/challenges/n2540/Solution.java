package davidch.leetcode.challenges.n2540;

public class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        var i1 = 0;
        var i2 = 0;
        while (i1 < nums1.length && i2 < nums2.length) {
            if (nums1[i1] == nums2[i2]) return nums1[i1];
            else if (nums1[i1] < nums2[i2]) i1++;
            else i2++;
        }

        return -1;
    }
}
