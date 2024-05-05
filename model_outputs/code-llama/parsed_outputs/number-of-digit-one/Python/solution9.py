class Solution(object):
    def countDigitOne(self, n):
       seen = set()
       for i in range(n+1):
           if str(i).count('1') > 0:
               seen.add(i)
       return len(seen)
    
