from collections import defaultdict

class Solution(object):
    def maxEnvelopes(self, envelopes):
        if not envelopes:
            return 0
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        dp = defaultdict(int)
        for w, h in envelopes:
            dp[w] = max(dp[w], 1 + max(dp[k] for k in dp if k < w))
        return max(dp.values())
