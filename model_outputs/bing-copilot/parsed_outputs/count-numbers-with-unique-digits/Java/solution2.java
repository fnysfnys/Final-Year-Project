public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = 9;
            for (int j = 9; j >= 11 - i; j--) {
                dp[i] *= j;
            }
            dp[i] += dp[i - 1];
        }
        return dp[n];
    }
}
