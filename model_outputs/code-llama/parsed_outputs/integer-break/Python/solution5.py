class Solution(object):
    def integerBreak(self, n):
       if n <= 2:
           return n
       else:
           return (n * (n + 1)) // 2
    
