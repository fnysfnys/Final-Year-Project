def numberOfArithmeticSlices(self, nums):
  n = len(nums)
  count = 0
  for i in range(n-2):
    for j in range(i+1, n):
      diff = nums[i+1] - nums[i]
      for k in range(j+1, n):
        if nums[k] - nums[k-1] != diff:
          break
        if k - i >= 2:
          count += 1
  return count
