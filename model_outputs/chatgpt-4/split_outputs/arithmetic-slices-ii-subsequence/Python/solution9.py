class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        [Docstring from the provided code snippet]
        """
        memo = {}

        def count_slices(start, diff):
            if (start, diff) in memo:
                return memo[(start, diff)]

            total = 0
            for end in range(start + 1, len(nums)):
                if nums[end] - nums[start] == diff:
                    total += count_slices(end, diff) + 1
            memo[(start, diff)] = total
            return total

        result = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                result += count_slices(j, nums[j] - nums[i])
        return result
