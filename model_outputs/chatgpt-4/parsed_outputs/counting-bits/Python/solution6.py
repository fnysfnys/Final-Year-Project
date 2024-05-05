class Solution(object):
    def countBits(self, n):
           if n == 0:
               return [0]
           prev = self.countBits(n - 1)
           return prev + [prev[-1] + (n & 1)]
       
