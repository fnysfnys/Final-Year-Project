class Solution(object):
    def maxEnvelopes(self, envelopes):
       if len(envelopes) == 1:
           return envelopes[0]
       mid = len(envelopes) // 2
       left = self.maxEnvelopes(envelopes[:mid])
       right = self.maxEnvelopes(envelopes[mid:])
       return left + right
    
