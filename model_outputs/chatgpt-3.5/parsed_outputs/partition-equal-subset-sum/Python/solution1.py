class Solution(object):
    def canPartition(self, nums):
        """
        Brute force recursive solution to check if it's possible to partition the array into two subsets with equal sums.
        """
        def can_partition_recursive(nums, index, sum1, sum2):
            if index == len(nums):
                return sum1 == sum2
            else:
                return can_partition_recursive(nums, index + 1, sum1 + nums[index], sum2) or can_partition_recursive(nums, index + 1, sum1, sum2 + nums[index])

        return can_partition_recursive(nums, 0, 0, 0)