class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        def arithmetic_slices():
            length = 2
            for i in range(2, len(nums)):
                if nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]:
                    length += 1
                    if length >= 3:
                        yield length - 2
                else:
                    length = 2

        return sum(arithmetic_slices())