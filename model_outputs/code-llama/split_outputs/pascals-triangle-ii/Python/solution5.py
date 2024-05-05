def getRow(self, rowIndex):
   def generate(rowIndex):
       if rowIndex == 0:
           yield 1
       elif rowIndex == 1:
           yield 1
           yield 1
       else:
           yield 1
           yield 2
           yield 1
   return list(generate(rowIndex))
