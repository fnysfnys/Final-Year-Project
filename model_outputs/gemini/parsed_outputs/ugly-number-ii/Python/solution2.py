class Solution(object):
    def nthUglyNumber(self, n):
        dp = [0] * (n + 1)
        dp[1] = 1
        i2, i3, i5 = 1, 1, 1
        for j in range(2, n + 1):
            next2, next3, next5 = 2 * dp[i2], 3 * dp[i3], 5 * dp[i5]
            min_val = min(next2, next3, next5)
            dp[j] = min_val
            if min_val == next2:
                i2 += 1
            elif min_val == next3:
                i3 += 1
            else:
                i5 += 1
        return dp[n]
    
