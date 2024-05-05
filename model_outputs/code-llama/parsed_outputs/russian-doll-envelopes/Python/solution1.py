class Solution(object):
    def maxEnvelopes(self, envelopes):
       max_envelopes = 0
       for i in range(len(envelopes)):
           for j in range(i+1, len(envelopes)):
               if envelopes[i][0] < envelopes[j][0] and envelopes[i][1] < envelopes[j][1]:
                   max_envelopes += 1
       return max_envelopes
    
