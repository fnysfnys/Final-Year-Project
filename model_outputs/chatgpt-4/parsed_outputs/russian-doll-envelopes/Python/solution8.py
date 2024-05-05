class Solution:
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        dp = [0] * len(envelopes)
        size = 0
        for _, h in envelopes:
            i = bisect_left(dp, h, 0, size)
            dp[i] = h
            if i == size:
                size += 1
        return size