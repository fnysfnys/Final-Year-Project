from collections import deque

class Solution(object):
    def canPartition(self, nums):
        """
        Using a queue to check if it's possible to partition the array into two subsets with equal sums.
        """
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        
        half_sum = total_sum // 2
        queue = deque([(0, 0)])
        
        while queue:
            current_index, current_sum = queue.popleft()
            if current_sum == half_sum:
                return True
            if current_index < len(nums):
                queue.append((current_index + 1, current_sum + nums[current_index]))
                queue.append((current_index + 1, current_sum))
        
        return False
