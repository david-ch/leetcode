package davidch.leetcode.challenges.n990;

public class Solution {

    private final int[] root = new int[26];

    public boolean equationsPossible(String[] equations) {
        for (var i = 0; i < root.length; i++) root[i] = i;

        for (var eq : equations)
            if (eq.charAt(1) == '=') union(eq.charAt(0) - 'a', eq.charAt(3) - 'a');

        for (var eq : equations)
            if (eq.charAt(1) == '!' && find(eq.charAt(0) - 'a') == find(eq.charAt(3) - 'a')) return false;

        return true;
    }

    private void union(int v1, int v2) {
        root[find(v2)] = find(v1);
    }

    private int find(int v) {
        if (root[v] != v) root[v] = find(root[v]);
        return root[v];
    }
}
