def maxCoins(self, nums):
  n = len(nums)
  nums = [1] + nums + [1]  # Add boundary 1s
  prev = [0] * (n+2)
  curr = [0] * (n+2)
  for i in range(n-1, -1, -1):
    for j in range(i+2, n+3):
      curr[j] = max(prev[j], nums[i] * nums[k] * nums[j] + prev[k] + curr[k])
    prev, curr = curr, prev
  return prev[n+1]
