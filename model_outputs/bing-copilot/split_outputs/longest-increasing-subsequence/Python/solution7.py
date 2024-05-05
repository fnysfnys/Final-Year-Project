class Solution(object):
    def lengthOfLIS(self, nums):
        stack = []
        for num in nums:
            while stack and stack[-1] >= num:
                stack.pop()
            stack.append(num)
        return len(stack)
