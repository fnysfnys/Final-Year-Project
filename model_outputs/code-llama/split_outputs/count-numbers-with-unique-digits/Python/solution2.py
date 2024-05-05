def countNumbersWithUniqueDigits(n):
   if n == 0:
       return 1
   else:
       count = 0
       for i in range(10):
           count += countNumbersWithUniqueDigits(n-1)
       return count
