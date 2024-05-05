class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        total = 0
        subsequences = set()
        for i in range(1, len(nums)):
            for j in range(i):
                diff = nums[i] - nums[j]
                subsequences.add((j, diff))
                total += (j, diff) in subsequences
        return total
