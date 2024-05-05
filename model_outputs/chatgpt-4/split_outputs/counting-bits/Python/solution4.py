   def countBits4(n):
       ans = [0] * (n + 1)
       highest_pow = 1
       for i in range(1, n + 1):
           if i == highest_pow * 2:
               highest_pow *= 2
           ans[i] = 1 + ans[i - highest_pow]
       return ans
   