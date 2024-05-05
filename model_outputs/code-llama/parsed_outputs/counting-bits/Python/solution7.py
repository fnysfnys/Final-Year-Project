class Solution(object):
    def countBits(self, n):
       memo = {}
       def helper(n):
           if n == 0:
               return 0
           elif n in memo:
               return memo[n]
           else:
               memo[n] = 1 + helper(n-1)
               return memo[n]
       return helper(n)
    
