class Solution {
    public int countDigitOne(int n) {
        int[] dp = new int[10];
        return countOnesDP(n, dp);
    }
    
    private int countOnesDP(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int count = countOnesDP(n / 10, dp);
        int lastDigit = n % 10;
        if (lastDigit == 1) {
            count++;
        }
        count += countOnesDP(n / 10, dp) * 10 + n / 10;
        dp[n] = count;
        return count;
    }
    
}
