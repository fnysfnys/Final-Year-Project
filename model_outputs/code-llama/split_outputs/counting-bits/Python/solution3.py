def countBits(n):
   result = []
   for i in range(n+1):
       result.append(i.bit_count())
   return result
