public int integerBreak(int n) {
    int[] memo = new int[n + 1];
    return helper(n, memo);
}

private int helper(int n, int[] memo) {
    if (n == 2) return 1;
    if (memo[n] != 0) return memo[n];
    int maxProduct = 0;
    for (int i = 1; i < n; i++) {
        maxProduct = Math.max(maxProduct, Math.max(i * (n - i), i * helper(n - i, memo)));
    }
    memo[n] = maxProduct;
    return maxProduct;
}
