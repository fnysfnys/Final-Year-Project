class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        if n < 3:
            return 0
        prev, total = 0, 0
        for i in range(2, n):
            if nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]:
                prev += 1
                total += prev
            else:
                prev = 0
        return total