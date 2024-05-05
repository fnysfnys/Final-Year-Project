class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        memo = {}

        def helper(i, prev, length):
            if i == len(nums):
                return 0
            if (i, prev, length) in memo:
                return memo[(i, prev, length)]

            total = 0
            if nums[i] - nums[i - 1] == prev:
                total = helper(i + 1, prev, length + 1) + (1 if length >= 2 else 0)
            else:
                total = helper(i + 1, nums[i] - nums[i - 1], 2)

            memo[(i, prev, length)] = total
            return total

        return helper(2, nums[1] - nums[0], 2) if len(nums) >= 3 else 0