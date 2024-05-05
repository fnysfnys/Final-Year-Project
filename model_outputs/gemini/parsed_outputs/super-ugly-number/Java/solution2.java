class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n + 1];
    
        dp[1] = 1;
        int idx = 1, min = 1;
        for (int i = 2; i <= n; i++) {
            for (int prime : primes) {
                int next = dp[idx] * prime;
                if (next < min) {
                    min = next;
                    idx++;
                }
                dp[i] = min;
            }
        }
    
        return dp[n];
    }
    
}
