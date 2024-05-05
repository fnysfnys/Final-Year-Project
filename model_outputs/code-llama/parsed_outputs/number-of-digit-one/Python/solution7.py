class Solution(object):
    def countDigitOne(self, n):
       if n == 0:
           return 0
       else:
           mid = n // 2
           return self.countDigitOne(mid) + self.countDigitOne(n-mid)
    
