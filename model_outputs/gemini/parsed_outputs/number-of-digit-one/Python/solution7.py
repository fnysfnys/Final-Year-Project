import re

class Solution(object):
    def countDigitOne(self, n):
      count = 0
      for i in range(1, n + 1):
        count += len(re.findall("1", str(i)))
      return count
    
