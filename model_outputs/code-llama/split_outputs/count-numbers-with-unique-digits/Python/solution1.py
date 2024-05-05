def countNumbersWithUniqueDigits(n):
   count = 0
   for i in range(10**n):
       if len(set(str(i))) == n:
           count += 1
   return count
