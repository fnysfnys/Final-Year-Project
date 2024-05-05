   def countBits8(n):
       ans = [format(i, 'b').count('1') for i in range(n + 1)]
       return ans
   