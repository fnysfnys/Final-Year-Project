class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
        
        For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
        
        Given an integer array nums, return the number of arithmetic subarrays of nums.
        A subarray is a contiguous subsequence of the array.
        """
        def is_arithmetic(arr):
            return all(arr[i] - arr[i+1] == arr[i+1] - arr[i+2] for i in range(len(arr)-2))

        return sum(1 for i in range(len(nums)) for j in range(i+2, len(nums)+1) if is_arithmetic(nums[i:j]))
