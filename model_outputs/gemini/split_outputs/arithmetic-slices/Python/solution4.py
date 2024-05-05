def numberOfArithmeticSlices(self, nums):
  n = len(nums)
  if n < 3:
    return 0
  diff = nums[1] - nums[0]
  prev = 0
  curr = 0
  for i in range(2, n):
    if nums[i] - nums[i-1] == diff:
      curr += 1
    else:
      if curr > 0:
        prev += curr * (curr + 1) // 2
      curr = 0
  if curr > 0:
    prev += curr * (curr + 1) // 2
  return prev
