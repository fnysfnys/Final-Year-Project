class Solution(object):
    def integerReplacement(self, n):
       if n == 1:
           return 0
       elif n % 2 == 0:
           return 1 + self.integerReplacement(n // 2)
       else:
           return 1 + self.integerReplacement(n - 1)
    
