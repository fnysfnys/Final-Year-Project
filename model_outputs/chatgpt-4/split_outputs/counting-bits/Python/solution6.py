   def countBits6(n):
       if n == 0:
           return [0]
       prev = countBits6(n - 1)
       return prev + [prev[-1] + (n & 1)]
   