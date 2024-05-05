class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 10;
        for (int i = 2; i <= n; i++) {
            int uniqueDigits = 9;
            for (int j = 2; j <= i && j <= 10; j++) {
                uniqueDigits *= 11 - j;
            }
            dp[i] = dp[i - 1] + uniqueDigits;
        }
        return dp[n];
    }
}
