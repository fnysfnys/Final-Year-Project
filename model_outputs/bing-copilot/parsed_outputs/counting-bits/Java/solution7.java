class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int[] lookup = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};
        for (int i = 0; i <= n; i++) {
            ans[i] = lookup[i & 15] + lookup[(i >> 4) & 15];
        }
        return ans;
    }
    
}
