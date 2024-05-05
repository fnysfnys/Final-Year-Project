class Solution {
    /**
     * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 10;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 9 * permutation(9, i - 1);
        }
        return dp[n];
    }

    private int permutation(int n, int r) {
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= n - i;
        }
        return result;
    }
}