class Solution(object):
    def countDigitOne(self, n):
      count = 0
      while n > 0:
        count += bin(n).count("1")
        n //= 2
      return count
    
