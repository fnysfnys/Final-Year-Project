class Solution(object):
    def countBits(self, n):
           def count_ones(x):
               count = 0
               while x:
                   x &= x - 1
                   count += 1
               return count
    
           ans = []
           for i in range(n + 1):
               ans.append(count_ones(i))
           return ans
       
