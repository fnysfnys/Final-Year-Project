class Solution(object):
    def integerBreak(self, n):
       memo = {}
       def helper(n):
           if n <= 2:
               return n
           elif n in memo:
               return memo[n]
           else:
               memo[n] = (n * (n + 1)) // 2
               return memo[n]
       return helper(n)
    
