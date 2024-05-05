class Solution(object):
    def canPartition(self, nums):
        """
        Using a generator function to check if it's possible to partition the array into two subsets with equal sums.
        """
        def partition_generator(index, sum1, sum2):
            if index == len(nums):
                yield sum1 == sum2


            else:
                yield from partition_generator(index + 1, sum1 + nums[index], sum2)
                yield from partition_generator(index + 1, sum1, sum2 + nums[index])
        
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        half_sum = total_sum // 2
        
        for result in partition_generator(0, 0, 0):
            if result:
                return True
        
        return False