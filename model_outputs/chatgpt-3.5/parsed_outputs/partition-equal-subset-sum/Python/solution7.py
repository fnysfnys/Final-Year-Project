from collections import Counter

class Solution(object):
    def canPartition(self, nums):
        """
        Using Counter to check if it's possible to partition the array into two subsets with equal sums.
        """
        count = Counter(nums)
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        
        half_sum = total_sum // 2
        dp = {0}
        
        for num, freq in count.items():
            new_dp = set()
            for s in dp:
                for i in range(1, freq + 1):
                    new_dp.add(s + num * i)
            dp.update(new_dp)
        
        return half_sum in dp