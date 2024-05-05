def countBits(n):
   def helper(n):
       if n == 0:
           yield 0
       else:
           yield 1 + helper(n-1)
   return list(helper(n))
