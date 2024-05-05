class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        Given an integer array nums, return the number of all the arithmetic subsequences of nums.
        A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
        ...
        :type nums: List[int]
        :rtype: int
        """
        def is_arithmetic(arr):
            return all(arr[i] - arr[i-1] == arr[1] - arr[0] for i in range(2, len(arr)))
        
        count = 0
        for i in range(len(nums)):
            for j in range(i + 2, len(nums)):
                if is_arithmetic(nums[i:j+1]):
                    count += 1
        return count
