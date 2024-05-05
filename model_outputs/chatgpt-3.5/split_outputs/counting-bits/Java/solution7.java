public int[] countBits(int n) {
    int[] ans = new int[n + 1];
    int[] lookup = new int[256];
    for (int i = 0; i < 256; i++) {
        lookup[i] = lookup[i >> 1] + (i & 1);
    }
    for (int i = 0; i <= n; i++) {
        ans[i] = lookup[i & 0xFF] + lookup[(i >> 8) & 0xFF] + lookup[(i >> 16) & 0xFF] + lookup[(i >> 24) & 0xFF];
    }
    return ans;
}
