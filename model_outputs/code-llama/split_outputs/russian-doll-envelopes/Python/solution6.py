def maxEnvelopes(envelopes):
   if len(envelopes) == 1:
       return envelopes[0]
   mid = len(envelopes) // 2
   left = maxEnvelopes(envelopes[:mid])
   right = maxEnvelopes(envelopes[mid:])
   return left + right
