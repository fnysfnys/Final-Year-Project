class Solution:
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        count = 0
        total_slices = 0
        diffs = set()
        for i in range(1, n):
            for j in range(i):
                diff = nums[i] - nums[j]
                if diff in diffs:
                    count += 1
                    total_slices += count
            diffs.add(diff)
        return total_slices
