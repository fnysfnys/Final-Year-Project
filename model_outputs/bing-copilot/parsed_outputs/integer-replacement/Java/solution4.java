    class Solution {
        public int integerReplacement(int n) {
            int[] dp = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    dp[i] = 1 + dp[i / 2];
                } else {
                    dp[i] = 1 + Math.min(dp[i + 1], dp[i - 1]);
                }
            }
            return dp[n];
        }
    }
    