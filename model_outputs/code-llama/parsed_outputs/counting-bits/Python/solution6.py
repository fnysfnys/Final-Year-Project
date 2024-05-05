class Solution(object):
    def countBits(self, n):
       if n == 0:
           return 0
       else:
           return 1 + self.countBits(n-1)
    
