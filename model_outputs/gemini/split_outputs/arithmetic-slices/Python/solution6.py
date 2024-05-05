def numberOfArithmeticSlices(self, nums):
  n = len(nums)
  if n < 3:
    return 0
  left, right = 0, 2
  count = 0
  while right < n:
    diff = nums[right] - nums[right-1]
    if nums[right-1] - nums[right-2] != diff:
      left = right - 1
    else:
      count += (right - left - 1)
    right += 1
  return count
