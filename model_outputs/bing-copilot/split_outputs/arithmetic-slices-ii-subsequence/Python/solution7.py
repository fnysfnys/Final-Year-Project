from collections import Counter

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        total = 0
        diff_count = Counter()
        for i in range(1, len(nums)):
            for j in range(i):
                diff = nums[i] - nums[j]
                total += diff_count[(j, diff)]
                diff_count[(i, diff)] += 1
        return total
