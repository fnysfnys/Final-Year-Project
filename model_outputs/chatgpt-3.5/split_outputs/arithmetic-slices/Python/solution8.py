class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
        
        For

 example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
        
        Given an integer array nums, return the number of arithmetic subarrays of nums.
        A subarray is a contiguous subsequence of the array.
        """
        count = 0
        stack = []
        for num in nums:
            while len(stack) >= 2 and num - stack[-1] == stack[-1] - stack[-2]:
                count += 1
                stack.pop()
            stack.append(num)
        return count
