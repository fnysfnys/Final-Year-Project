from itertools import combinations

class Solution(object):
    def canPartition(self, nums):
        """
        Using itertools.combinations to check if it's possible to partition the array into two subsets with equal sums.
        """
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        
        half_sum = total_sum // 2
        for i in range(1, len(nums) + 1):
            for combo in combinations(nums, i):
                if sum(combo) == half_sum:
                    return True
        
        return False