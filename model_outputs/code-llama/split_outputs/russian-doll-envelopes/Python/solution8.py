def maxEnvelopes(envelopes):
   memo = {}
   for i in range(len(envelopes)):
       memo[i] = 0
   for i in range(len(envelopes)):
       for j in range(i+1, len(envelopes)):
           if envelopes[i][0] < envelopes[j][0] and envelopes[i][1] < envelopes[j][1]:
               memo[i] += 1
   return max(memo.values())
