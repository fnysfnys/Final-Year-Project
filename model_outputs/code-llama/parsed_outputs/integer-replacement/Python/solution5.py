class Solution(object):
    def integerReplacement(self, n):
       if n == 1:
           return 0
       else:
           return 1 + self.integerReplacement(n + 1)
    
