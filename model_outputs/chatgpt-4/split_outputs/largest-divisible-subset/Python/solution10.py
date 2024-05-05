class Solution(object):
    def largestDivisibleSubset(self, nums):
        nums.sort()
        dp = [[num] for num in nums]
        largest_subset = []
        for i in range(len(nums)):
            current_subset = [nums[i]]
            for j in range(i):
                if nums[i] % nums[j] == 0 and len(dp[j]) + 1 > len(current_subset):
                    current_subset = dp[j] + [nums[i]]
            dp[i] = current_subset
            if len(current_subset) > len(largest_subset):
                largest_subset = current_subset
        return largest_subset
