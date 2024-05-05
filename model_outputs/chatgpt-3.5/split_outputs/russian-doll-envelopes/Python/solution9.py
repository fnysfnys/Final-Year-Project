import itertools

class Solution(object):
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        grouped = itertools.groupby(envelopes, key=lambda x: x[0])
        lis = []
        for _, group in grouped:
            lis.extend(sorted(h for _, h in group))
        dp = [1] * len(lis)
        for i in range(len(lis)):
            for j in range(i):
                if lis[i] > lis[j]:
                    dp[i] = max(dp[i], dp[j] + 1)
        return max(dp)
