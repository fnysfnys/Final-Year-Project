class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
        
        For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
        
        Given an integer array nums, return the number of arithmetic subarrays of nums.
        A subarray is a contiguous subsequence of the array.
        """
        count = 0
        i = 0
        while i < len(nums) - 2:
            if nums[i] - nums[i+1] == nums[i+1] - nums[i+2]:
                count += 1
                j = i + 2
                while j < len(nums) - 1 and nums[j] - nums[j+1] == nums[i] - nums[i+1]:
                    count += 1
                    j += 1
                i = j
            else:
                i += 1
        return count
