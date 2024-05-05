class Solution(object):
    def canPartition(self, nums):
        def backtrack(index, curr_sum):
            if curr_sum == target_sum:
                return True
            if curr_sum > target_sum or index >= len(nums):
                return False
            
            # Include the current number in the subset
            if backtrack(index + 1, curr_sum + nums[index]):
                return True
            
            # Exclude the current number from the subset
            return backtrack(index + 1, curr_sum)
        
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        target_sum = total_sum // 2
        return backtrack(0, 0)
