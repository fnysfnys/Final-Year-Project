class Solution {
    public int[] countBits(int n) {
        int[] table = new int[256];
        for (int i = 0; i < 256; i++) {
            table[i] = (i & 1) + table[i >> 1];
        }
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = table[i & 0xff] + table[(i >> 8) & 0xff] + table[(i >> 16) & 0xff] + table[(i >> 24) & 0xff];
        }
        return ans;
    }
    
}
