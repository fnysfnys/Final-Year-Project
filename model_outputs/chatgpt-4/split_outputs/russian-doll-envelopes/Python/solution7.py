class Solution:
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        dp = []
        for _, h in envelopes:
            index = bisect_left(dp, h)
            if index == len(dp):
                dp.append(h)
            else:
                dp[index] = h
        return len(dp)
