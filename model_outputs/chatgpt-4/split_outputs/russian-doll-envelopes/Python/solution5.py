class Solution:
    def maxEnvelopes(self, envelopes):
        def helper(i, prev_w, prev_h):
            if i >= len(envelopes):
                return 0
            if (prev_w, prev_h, i) in memo:
                return memo[(prev_w, prev_h, i)]

            skip = helper(i + 1, prev_w, prev_h)
            take = 0
            if envelopes[i][0] > prev_w and envelopes[i][1] > prev_h:
                take = 1 + helper(i + 1, envelopes[i][0], envelopes[i][1])

            memo[(prev_w,

prev_h, i)] = max(skip, take)
            return memo[(prev_w, prev_h, i)]

        envelopes.sort(key=lambda x: (x[0], -x[1]))
        memo = {}
        return helper(0, -1, -1)
