class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
       if n == 0:
           return 1
       else:
           count = 0
           for i in range(10):
               count += self.countNumbersWithUniqueDigits(n-1)
           return count
    
