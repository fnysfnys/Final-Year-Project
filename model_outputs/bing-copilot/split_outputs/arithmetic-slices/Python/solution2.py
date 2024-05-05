class Solution:
    def numberOfArithmeticSlices(self, nums):
        def is_arithmetic_subset(subset):
            if len(subset) <= 2:
                return 0
            diff = subset[1] - subset[0]
            for i in range(2, len(subset)):
                if subset[i] - subset[i-1] != diff:
                    return 0
            return 1
        
        if len(nums) <= 2:
            return 0
        sub_arrays = [nums[i:i+j] for i in range(len(nums)) for j in range(3, len(nums) - i + 1)]
        count = 0
        for subset in sub_arrays:
            count += is_arithmetic_subset(subset)
        return count
