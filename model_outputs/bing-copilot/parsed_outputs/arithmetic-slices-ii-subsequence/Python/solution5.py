class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        total = 0
        diff_count = {}
        for i in range(1, len(nums)):
            for j in range(i):
                diff = nums[i] - nums[j]
                total += diff_count.get((j, diff), 0)
                diff_count[(i, diff)] = diff_count.get((i, diff), 0) + 1
        return total
