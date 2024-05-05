class Solution(object):
    def integerBreak(self, n):
      def backtrack(i, prod):
        if i == n:
          global max_product
          max_product = max(max_product, prod)
          return
        for j in range(1, min(n - i + 1, 3)):
          backtrack(i + j, prod * j)
      
      max_product = 0
      backtrack(1, 1)
      return max_product
    
