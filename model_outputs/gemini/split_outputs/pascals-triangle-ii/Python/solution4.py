def getRow(rowIndex):
  result = [1] * (rowIndex + 1)
  if rowIndex == 0: return result
  for i in range(2, rowIndex+1):
    for j in range(i-1, 0, -1):
      result[j] = result[j-1] + result[j]
  return result
