class Solution(object):
    def countDigitOne(self, n):
      if n == 0:
        return 0
      
      res = n % 10 * self.countDigitOne(n // 10)
      if n % 10 == 1:
        res += n // 10 + 1
      return res
    
