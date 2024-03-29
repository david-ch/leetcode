package davidch.leetcode.challenges.n605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        for (var i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) continue;
            if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) return true;
            }
        }

        return false;
    }
}
