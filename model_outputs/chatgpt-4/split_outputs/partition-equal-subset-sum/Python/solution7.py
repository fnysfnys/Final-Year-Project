class Solution:
    def canPartition(self, nums):
        total = sum(nums)
        if total % 2 != 0:
            return False
        target = total // 2
        
        dp = set([0])
        for num in nums

:
            new_dp = set()
            for t in dp:
                if t + num == target:
                    return True
                new_dp.add(t + num)
                new_dp.add(t)
            dp = new_dp
        return False
