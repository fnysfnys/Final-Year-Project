class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        if buckets == 1:
            return 0
        if minutesToTest <= minutesToDie:
            return -1
        
        dp = [[float('inf')] * (minutesToTest // minutesToDie + 2) for _ in range(buckets + 1)]
        dp[1][1] = 0
        
        for i in range(2, buckets + 1):
            for tests in range(1, minutesToTest // minutesToDie + 2):
                for pigs in range(1, i):
                    remainingTime = minutesToTest - minutesToDie
                    remainingBuckets = i - pigs
                    dp[i][tests] = min(dp[i][tests], tests + dp[remainingBuckets][tests - 1])
        
        return min(dp[buckets]) if dp[buckets][0] != float('inf') else -1
