def countNumbersWithUniqueDigits(n):
   memo = {}
   def count(n):
       if n == 0:
           return 1
       else:
           if n not in memo:
               memo[n] = 0
               for i in range(10):
                   if i not in memo[n-1]:
                       memo[n] += 1
           return memo[n]
   return count(n)
