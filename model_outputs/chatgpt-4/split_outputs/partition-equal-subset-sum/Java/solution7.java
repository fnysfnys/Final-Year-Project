public class Solution {
    /**
     * You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * 
     * Example:
     * Input: n = 3
     * Output: 3
     * Explanation: There are three ways to climb to the top. 1 step + 1 step + 1 step, 1 step + 2 steps, 2 steps + 1 step.
     */
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
