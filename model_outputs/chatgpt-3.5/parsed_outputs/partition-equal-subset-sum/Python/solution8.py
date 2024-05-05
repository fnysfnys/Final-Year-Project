class Solution(object):
    def canPartition(self, nums):
        """
        Using a stack to check if it's possible to partition the array into two subsets with equal sums.
        """
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        
        half_sum = total_sum // 2
        stack = [(0, 0)]
        
        while stack:
            current_index, current_sum = stack.pop()
            if current_sum == half_sum:
                return True
            if current_index < len(nums):
                stack.append((current_index + 1, current_sum + nums[current_index]))
                stack.append((current_index + 1, current_sum))
        
        return False