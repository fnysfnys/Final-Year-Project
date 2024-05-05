class Solution(object):
    def maxEnvelopes(self, envelopes):
      envelopes.sort(key=lambda e: (e[0], e[1]))
      dp = {}
      for w, h in envelopes:
        dp[(w, h)] = max(dp.get((w, prev), 0) + 1 for prev in dp if prev < h)
      return max(dp.values(), default=0)
    
