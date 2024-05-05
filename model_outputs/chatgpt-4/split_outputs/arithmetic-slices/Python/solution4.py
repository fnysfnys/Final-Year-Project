class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        def countSlices(i, prev, length):
            if i >= len(nums):
                return 0 if length < 3 else length - 2
            if nums[i] - nums[i - 1] == prev:
                return countSlices(i + 1, prev, length + 1) + (length - 1 if length >= 3 else 0)
            else:
                return countSlices(i + 1, nums[i] - nums[i - 1], 2)

        return countSlices(2, nums[1] - nums[0], 2) if len(nums) >= 3 else 0
