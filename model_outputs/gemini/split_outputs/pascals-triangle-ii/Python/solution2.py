memo = {}
def getRow(rowIndex):
  if rowIndex in memo: return memo[rowIndex]
  if rowIndex == 0: return [1]
  prevRow = getRow(rowIndex - 1)
  result = [1] + [prevRow[i] + prevRow[i+1] for i in range(len(prevRow)-1)] + [1]
  memo[rowIndex] = result
  return result
