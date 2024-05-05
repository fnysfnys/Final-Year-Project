def maxEnvelopes(self, envelopes):
  envelopes.sort(key=lambda e: (e[0], -e[1]))
  dp = [1] * len(envelopes)
  for i in range(1, len(envelopes)):
    for j in range(i):
      if envelopes[i][1] > envelopes[j][1]:
        dp[i] = max(dp[i], dp[j] + 1)
  return max(dp)
