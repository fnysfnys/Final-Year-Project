def integerBreak(n):
   if n <= 2:
       return n
   else:
       return integerBreak(n-1) * integerBreak(n-2)
