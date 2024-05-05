def maxEnvelopes(envelopes):
   envelopes.sort(key=lambda x: x[0])
   max_envelopes = 0
   for i in range(len(envelopes)):
       if envelopes[i][0] > max_envelopes[0]:
           max_envelopes = envelopes[i]
   return max_envelopes
