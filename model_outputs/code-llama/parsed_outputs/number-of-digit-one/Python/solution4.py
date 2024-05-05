class Solution(object):
    def countDigitOne(self, n):
       if n == 0:
           return 0
       else:
           return 1 + self.countDigitOne(n-1)
    
