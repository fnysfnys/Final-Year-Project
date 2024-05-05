class Solution(object):
    def lengthOfLIS(self, nums):
        """
        Given an integer array nums, return the length of the longest strictly increasing subsequence.
        
        ... (same docstring as provided)
        
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        
        stack = []
        for num in nums:
            if not stack or num > stack[-1]:
                stack.append(num)
            else:
                left, right = 0, len(stack) - 1
                while left < right:
                    mid = left + (right - left) // 2
                    if stack[mid] < num:
                        left = mid + 1
                    else:
                        right = mid
                stack[left] = num
        
        return len(stack)
