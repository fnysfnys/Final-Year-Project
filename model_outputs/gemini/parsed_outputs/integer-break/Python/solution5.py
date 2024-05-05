class Solution(object):
    def integerBreak(self, n):
      if n <= 3:
        return n - 1
      k = n // 3
      rem = n % 3
      if rem == 0:
        return 3**k
      elif rem == 1:
        return 4 * 3**(k-1)
      else:
        return 2 * 3**k
    
