class Solution(object):
    def nthUglyNumber(self, n):
        dp = [0] * (n + 1)
        dp[1] = 1
        i2, i3, i5 = 1, 1, 1
        for j in range(2, n + 1):
            dp[j] = min(dp[i2] * 2, dp[i3] * 3, dp[i5] * 5)
            if dp[j] == dp[i2] * 2:
                i2 += 1
            if dp[j] == dp[i3] * 3:
                i3 += 1
            if dp[j] == dp[i5] * 5:
                i5 += 1
        return dp[n]
    
