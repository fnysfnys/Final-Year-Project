def maxRotateFunction(nums):
   return max([sum(nums[j] * nums[j] for j in range(len(nums)))])
