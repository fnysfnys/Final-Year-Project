class Solution(object):
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        def dfs(i, prev_height):
            if i == len(envelopes):
                return 0
            without_curr = dfs(i + 1, prev_height)
            with_curr = 1 + dfs(i + 1, envelopes[i][1]) if envelopes[i][1] > prev_height else 0
            return max(without_curr, with_curr)
        return dfs(0, float('-inf'))
