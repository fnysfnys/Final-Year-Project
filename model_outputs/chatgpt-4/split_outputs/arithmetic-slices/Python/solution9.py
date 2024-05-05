class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        count, length = 0, 0
        for i, num in enumerate(nums[2:], start=2):
            if num - nums[i - 1] == nums[i - 1] - nums[i - 2]:
                length += 1
                count += length
            else:
                length = 0
        return count
