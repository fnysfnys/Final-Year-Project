def integerBreak(n):
   low = 1
   high = n
   while low <= high:
       mid = (low + high) // 2
       if (mid * (mid + 1)) // 2 <= n:
           low = mid + 1
       else:
           high = mid - 1
   return low
