def countDigitOne(n):
   return sum([1 for i in range(n+1) if str(i).count('1') > 0])
