class Solution(object):
    def maxEnvelopes(self, envelopes):
      envelopes.sort(key=lambda e: (e[0], e[1]))
      tails = []
      for e in envelopes:
        i = bisect_left(tails, e[1])
        if i == len(tails):
          tails.append(e[1])
        else:
          tails[i] = e[1]
      return len(tails)
    
