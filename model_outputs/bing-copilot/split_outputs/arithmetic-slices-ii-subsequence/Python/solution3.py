class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        def helper(start, diff, memo):
            if start >= len(nums) - 2:
                return 0
            if (start, diff) in memo:
                return memo[(start, diff)]
            total_slices = 0
            for end in range(start + 2, len(nums)):
                if nums[end] - nums[end - 1] == diff:
                    total_slices += 1 + helper(end, diff, memo)
            memo[(start, diff)] = total_slices
            return total_slices
        
        total = 0
        for i in range(len(nums)):
            total += helper(i, nums[i] - nums[i - 1], {})
        return total
