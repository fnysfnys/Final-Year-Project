def maxEnvelopes(self, envelopes, i=0, prev=float('-inf')):
  if i == len(envelopes):
    return 0
  dp = {(i, prev): None}
  for j in range(i + 1, len(envelopes)):
    if envelopes[j][0] > envelopes[i][0] and envelopes[j][1] > prev:
      res = dp.get((j, envelopes[i][1]), maxEnvelopes(self, envelopes, j, envelopes[i][1]))
      if dp[(i, prev)] is None or res + 1 > dp[(i, prev)]:
        dp[(i, prev)] = res + 1
  return dp[(i, prev)]
