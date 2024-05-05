class Solution(object):
    def maxEnvelopes(self, envelopes):
        max_height = max(envelopes, key=lambda x: x[1])[1]
        count = [0] * (max_height + 1)
        for _, h in envelopes:
            count[h] += 1
        dp = [0] * (max_height + 1)
        for h in range(1, max_height + 1):
            dp[h] = max(dp[h - 1], count[h] + dp[h - 2])
        return dp[max_height]
