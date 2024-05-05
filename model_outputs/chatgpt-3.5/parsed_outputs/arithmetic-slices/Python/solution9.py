class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
        
        For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
        
        Given an integer array nums, return the number of arithmetic subarrays of nums.
        A subarray is a contiguous subsequence of the array.
        """
        count = 0
        n = len(nums)
        for i in range(n):
            diff = nums[i] - nums[i - 1] if i > 0 else 0
            j = i
            while j < n - 1 and nums[j + 1] - nums[j] == diff:
                j += 1
            length = j - i + 1
            count += (length - 2) * (length - 1) // 2
        return count