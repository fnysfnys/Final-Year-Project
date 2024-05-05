class Solution:
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        heights = sorted(set(h for _, h in envelopes))
        dp = {h: 0 for h in heights}
        for _, h in envelopes:
            dp[h] = max(dp[h], max([dp[prev_h] for prev_h in heights if prev_h < h], default=0) + 1)
        return max(dp.values())
