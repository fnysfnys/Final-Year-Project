class Solution(object):
    def canPartition(self, nums):
        """
        Recursive solution with memoization to check if it's possible to partition the array into two subsets with equal sums.
        """
        def can_partition_recursive(nums, index, sum1, sum2, memo):
            if index == len(nums):
                return sum1 == sum2
            if (index, sum1, sum2) in memo:
                return memo[(index, sum1, sum2)]
            
            can_partition = can_partition_recursive(nums, index + 1, sum1 + nums[index], sum2, memo) or can_partition_recursive(nums, index + 1, sum1, sum2 + nums[index], memo)
            memo[(index, sum1, sum2)] = can_partition
            return can_partition
        
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        half_sum = total_sum // 2
        memo = {}
        return can_partition_recursive(nums, 0, 0, 0, memo)
