public int[] countBits(int n) {
    int[] ans = new int[n + 1];
    int[] table = new int[256];
    for (int i = 0; i < 256; i++) {
        table[i] = table[i >> 1] + (i & 1);
    }
    for (int i = 0; i <= n; i++) {
        ans[i] = table[i & 0xFF] + table[(i >> 8) & 0xFF] + table[(i >> 16) & 0xFF] + table[(i >> 24) & 0xFF];
    }
    return ans;
}
