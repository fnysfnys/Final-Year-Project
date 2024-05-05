class Solution(object):
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        memo = {}
        def dp(i):
            if i in memo:
                return memo[i]
            memo[i] = 1
            for j in range(i):
                if envelopes[j][1] < envelopes[i][1]:
                    memo[i] = max(memo[i], dp(j) + 1)
            return memo[i]
        return max(dp(i) for i in range(len(envelopes)))
