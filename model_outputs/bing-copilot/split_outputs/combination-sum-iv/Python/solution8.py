from functools import lru_cache

class Solution(object):
    @lru_cache(maxsize=None)
    def combinationSum4(self, nums, target):
        if target == 0:
            return 1
        count = 0
        for num in nums:
            if target >= num:
                count += self.combinationSum4(nums, target - num)
        return count
