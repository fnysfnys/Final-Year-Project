   def countBits5(n):
       def count_ones(x):
           count = 0
           while x:
               count += x & 1
               x >>= 1
           return count

       ans = [count_ones(i) for i in range(n + 1)]
       return ans
   