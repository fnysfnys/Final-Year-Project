class Solution(object):
    def canPartition(self, nums):
        def dfs(index, target_sum, memo):
            if target_sum == 0:
                return True
            if index >= len(nums) or target_sum < 0:
                return False
            if (index, target_sum) in memo:
                return memo[(index, target_sum)]
            
            # Include the current number in the subset
            if dfs(index + 1, target_sum - nums[index], memo):
                memo[(index, target_sum)] = True
                return True
            
            # Exclude the current number from the subset
            memo[(index, target_sum)] = dfs(index + 1, target_sum, memo)
            return memo[(index, target_sum)]
        
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        target_sum = total_sum // 2
        return dfs(0, target_sum, {})
