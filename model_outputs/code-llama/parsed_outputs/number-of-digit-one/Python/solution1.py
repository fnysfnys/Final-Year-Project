class Solution(object):
    def countDigitOne(self, n):
       count = 0
       for i in range(n+1):
           if str(i).count('1') > 0:
               count += 1
       return count
    
