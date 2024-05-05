class Solution(object):
    def countDigitOne(self, n):
      count = 0
      power = 1
      while n > 0:
        digit = n % 10
        prev_count = n // 10 * power
        if digit == 1:
          count += prev_count + 1
        elif digit > 1:
          count += prev_count + power
        power *= 10
        n //= 10
      return count
    
