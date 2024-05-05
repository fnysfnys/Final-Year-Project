def integerReplacement(n):
   if n == 1:
       return 0
   else:
       return 1 + integerReplacement(n + 1)
