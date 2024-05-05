public int countDigitOne(int n) {
    int[] dp = new int[n + 1];
    for (int i = 1; i <= n; i++) {
        dp[i] = dp[i / 10] + (i % 10 == 1 ? 1 : 0);
    }
    return Arrays.stream(dp).sum();
}
