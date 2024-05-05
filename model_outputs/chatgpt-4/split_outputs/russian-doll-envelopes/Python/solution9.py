class Solution:
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        max_h = 0
        count = 0
        for _, h in envelopes:
            if h > max_h:
                count += 1
                max_h = h
        return count
