def maxCoins(self, nums):
  n = len(nums)
  nums = [1] + nums + [1]  # Add boundary 1s
  def helper(left, right):
    if left > right: return 0
    max_coin = 0
    for i in range(left+1, right):
      max_coin = max(max_coin, nums[left] * nums[i] * nums[right] + helper(left, i-1) + helper(i+1, right))
    return max_coin
  return helper(1, n)
