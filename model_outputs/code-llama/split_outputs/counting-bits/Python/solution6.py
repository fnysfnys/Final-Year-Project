def countBits(n):
   if n == 0:
       return 0
   else:
       return 1 + countBits(n-1)
