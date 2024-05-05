class Solution(object):
    def maxCoins(self, nums):
        nums = [1] + nums + [1]
        n = len(nums)
        coins = 0
        while len(nums) > 2:
            max_val = float('-inf')
            idx = -1
            for i in range(1, len(nums) - 1):
                val = nums[i - 1] * nums[i] * nums[i + 1]
                if val > max_val:
                    max_val = val
                    idx = i
            coins += max_val
            nums.pop(idx)
        return coins
