def countNumbersWithUniqueDigits(n):
   count = 0
   for i in range(10**n):
       for j in range(10):
           if j not in str(i):
               count += 1
   return count
