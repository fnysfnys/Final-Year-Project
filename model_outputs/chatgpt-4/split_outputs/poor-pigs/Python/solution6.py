class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        dp = [0] * (buckets + 1)
        rounds = minutesToTest // minutesToDie
        for i in range(1, buckets + 1):
            dp[i] = 1 + dp[i - (rounds + 1)]
        return dp[buckets]
