class Solution(object):
    def canPartition(self, nums):
        nums.sort(reverse=True)
        target = sum(nums) // 2
        subset1, subset2 = 0, 0
        for num in nums:
            if subset1 <= subset2:
                subset1 += num
            else:
                subset2 += num
            if subset1 == target or subset2 == target:
                return True
        return False
