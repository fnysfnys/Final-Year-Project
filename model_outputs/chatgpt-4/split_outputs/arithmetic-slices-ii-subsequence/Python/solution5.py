class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       

        """
        [Docstring from the provided code snippet]
        """
        def count_arithmetic_slices(start, end, diff, nums):
            if end >= len(nums):
                return 0

            total = 0
            if end - start >= 2 and nums[end] - nums[end - 1] == diff:
                total += 1

            total += count_arithmetic_slices(start, end + 1, diff, nums)
            return total

        result = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                diff = nums[j] - nums[i]
                result += count_arithmetic_slices(i, j + 1, diff, nums)

        return result
