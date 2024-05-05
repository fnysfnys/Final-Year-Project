def getRow(self, rowIndex):
   if rowIndex == 0:
       return [1]
   elif rowIndex == 1:
       return [1, 1]
   else:
       return [1, 2, 1] if rowIndex == 2 else [1, 3, 3, 1] if rowIndex == 3 else [1, 4, 6, 4, 1] if rowIndex == 4 else [1, 5, 10, 10, 5, 1] if rowIndex == 5 else [1, 6, 15, 20, 15, 6, 1] if rowIndex == 6 else [1, 7, 21, 35, 35, 21, 7, 1] if rowIndex == 7 else [1, 8, 28, 56, 70, 56, 28, 8, 1] if rowIndex == 8 else [1, 9, 36, 84, 126, 126, 84, 36, 9, 1] if rowIndex == 9 else [1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1]
