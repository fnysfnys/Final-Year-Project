def getRow(self, rowIndex):
   result = []
   i = 0
   while i <= rowIndex:
       if i == 0:
           result.append(1)
       else:
           result.append(result[i - 1] + result[i - 2])
       i += 1
   return result
