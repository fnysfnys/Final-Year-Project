class Solution(object):
    def canPartition(self, nums):
        dp = {}
        totalSum = sum(nums)
        if totalSum % 2 != 0:
            return False
        return self.dfs(nums, 0, totalSum // 2, dp)

    def dfs(self, nums, i, target, dp):
        if target == 0:
            return True
        if i >= len(nums) or target < 0:
            return False
        if (i, target) in dp:
            return dp[(i, target)]
        dp[(i, target)] = self.dfs(nums, i + 1, target, dp) or self.dfs(nums, i + 1, target - nums[i], dp)
        return dp[(i, target)]
