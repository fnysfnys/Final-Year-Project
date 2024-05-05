def generate(self, numRows):
   if numRows == 0:
       return []
   else:
       return [[1] * (i + 1) for i in range(numRows)]
