def numberOfArithmeticSlices(self, nums):
  n = len(nums)
  if n < 3:
    return 0
  
  def checkSlice(i, j):
    diff = nums[i+1] - nums[i]
    for k in range(i+2, j+1):
      if nums[k] - nums[k-1] != diff:
        return False
    return True
  
  count = 0
  for i in range(n-2):
    for j in range(i+1, n):
      if checkSlice(i, j):
        count += j - i - 1
  return count
