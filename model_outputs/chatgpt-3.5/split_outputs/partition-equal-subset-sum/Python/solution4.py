class Solution(object):
    def canPartition(self, nums):
        """
        Using sets to check if it's possible to partition the array into two subsets with equal sums.
        """
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        
        half_sum = total_sum // 2
        possible_sums = {0}
        
        for num in nums:
            new_possible_sums = set()
            for s in possible_sums:
                new_possible_sums.add(s + num)
            possible_sums.update(new_possible_sums)
        
        return half_sum in possible_sums
