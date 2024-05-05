     def poorPigs(buckets, minutesToDie, minutesToTest):
         dp = [0] * (buckets + 1)
         for i in range(1, buckets + 1):
             dp[i] = dp[i - 1] + 1
             for j in range(2, minutesToTest // minutesToDie + 1):
                 dp[i] = min(dp[i], 1 + dp[i - 1])
         return dp[buckets]
     