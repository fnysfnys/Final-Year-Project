class Solution(object):
    def maxEnvelopes(self, envelopes):
      envelopes.sort(key=lambda e: (e[0], e[1]))
      count = 0
      prev = float('-inf')
      for w, h in envelopes:
        if h > prev:
          count += 1
          prev = h
      return count
    
