class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        def count_slices(start, diff):
            if start >= len(nums) - 2:
                return 0
            total_slices = 0
            for end in range(start + 2, len(nums)):
                if nums[end] - nums[end - 1] == diff:
                    total_slices += 1 + count_slices(end, diff)
            return total_slices
        
        total = 0
        for i in range(len(nums)):
            total += count_slices(i, nums[i] - nums[i - 1])
        return total
