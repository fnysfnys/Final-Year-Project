class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[Math.min(n, 4) + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[

3] = 3;
        int maxProduct = 0;
        for (int i = 4; i <= n; i++) {
            maxProduct = Math.max(3 * dp[i - 3], 2 * dp[i - 2]);
        }
        return n <= 3 ? dp[n] : maxProduct;
    }
}