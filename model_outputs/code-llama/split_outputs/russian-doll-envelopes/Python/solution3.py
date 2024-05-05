def maxEnvelopes(envelopes):
   dp = [0] * len(envelopes)
   for i in range(len(envelopes)):
       for j in range(i+1, len(envelopes)):
           if envelopes[i][0] < envelopes[j][0] and envelopes[i][1] < envelopes[j][1]:
               dp[i] += 1
   return max(dp)
