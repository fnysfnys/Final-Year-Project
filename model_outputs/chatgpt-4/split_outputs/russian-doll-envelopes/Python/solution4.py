class Solution:
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        dp = [1] * len(envelopes)
        for i in range(1, len(envelopes)):
            dp[i] = max(dp[j] + 1 for j in range(i) if envelopes[j][1] < envelopes[i][1], default=dp[i])
        return max(dp)
