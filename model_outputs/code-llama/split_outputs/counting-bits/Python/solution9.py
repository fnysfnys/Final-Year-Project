def countBits(n):
   return [1 + countBits(n-1) for i in range(n)]
