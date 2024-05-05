class Solution:
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        heights = [h for _, h in envelopes]
        dp = [1] * len(envelopes)
        for i in range(len(envelopes)):
            for j in range(i):
                if heights[i] > heights[j]:
                    dp[i] = max(dp[i], dp[j] + 1)
        return max(dp)
