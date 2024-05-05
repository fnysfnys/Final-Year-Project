class Solution(object):
    def integerBreak(self, n):
       if n <= 2:
           return n
       else:
           return self.integerBreak(n-1) * self.integerBreak(n-2)
    
