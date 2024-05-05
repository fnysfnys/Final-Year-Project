def countDigitOne(n):
   if n == 0:
       return 0
   else:
       mid = n // 2
       return countDigitOne(mid) + countDigitOne(n-mid)
