   def countBits2(n):
       ans = [bin(i).count('1') for i in range(n + 1)]
       return ans
   