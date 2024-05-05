class Solution:
    def maxEnvelopes(self, envelopes):
        def compare(a, b):
            return a[0] - b[0] if a[0] != b[0] else b[1] - a[1]

        envelopes.sort(key=cmp_to_key(compare))
        dp = []
        for _, h in envelopes:
            pos = bisect_left(dp, h)
            if pos == len(dp):
                dp.append(h)
            else:
                dp[pos] = h
        return len(dp)