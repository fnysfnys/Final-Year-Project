class Solution(object):
    def countDigitOne(self, n):
       low = 0
       high = n+1
       while low < high:
           mid = (low + high) // 2
           if str(mid).count('1') > 0:
               high = mid
           else:
               low = mid + 1
       return high
    
