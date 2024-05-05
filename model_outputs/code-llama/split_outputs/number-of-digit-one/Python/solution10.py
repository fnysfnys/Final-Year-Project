def countDigitOne(n):
   count = 0
   for i in range(n+1):
       if i & (i-1) == 0:
           count += 1
   return count
