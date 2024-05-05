class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int[] lookup = new int[256];
        for (int i = 1; i < 256; i++) {
            lookup[i] = lookup[i >> 1] + (i & 1);
        }
        for (int i = 0; i <= n; i++) {
            ans[i] = lookup[i & 255] + lookup[(i >> 8) & 255] + lookup[(i >> 16) & 255] + lookup[(i >> 24) & 255];
        }
        return ans;
    }
    
}
