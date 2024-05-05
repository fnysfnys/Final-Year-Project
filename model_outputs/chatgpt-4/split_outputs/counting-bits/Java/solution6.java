class Solution {
    private static final int[] BIT_COUNT_TABLE = createBitCountTable();

    private static int[] createBitCountTable() {
        int[] table = new int[256];
        for (int i = 0; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
        return table;
    }

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = BIT_COUNT_TABLE[i & 0xff] 
                   + BIT_COUNT_TABLE[(i >>> 8) & 0xff]
                   + BIT_COUNT_TABLE[(i >>> 16) & 0xff]
                   + BIT_COUNT_TABLE[(i >>> 24) & 0xff];
        }
        return ans;
    }
}
