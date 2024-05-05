class Solution(object):
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        memo = {}
        def dfs(i, prev_height):
            if i == len(envelopes):
                return 0
            if (i, prev_height) in memo:
                return memo[(i, prev_height)]
            without_curr = dfs(i + 1, prev_height)
            with_curr = 1 + dfs(i + 1, envelopes[i][1]) if envelopes[i][1] > prev_height else 0
            memo[(i, prev_height)] = max(without_curr, with_curr)
            return memo[(i, prev_height)]
        return dfs(0, float('-inf'))
