class Solution:
    def canPartition(self, nums):
        def backtrack(start, target):
            if target == 0:
                return True
            if target < 0:
                return False
            for i in range(start, len(nums)):
                if backtrack(i + 1, target - nums[i]):
                    return True
            return False
        
        total = sum(nums)
        if total % 2 != 0:
            return False
        return backtrack(0, total // 2)