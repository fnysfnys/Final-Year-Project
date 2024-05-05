class Solution:
    def numberOfArithmeticSlices(self, nums):
        stack = []
        total_slices = 0
        for num in nums:
            while len(stack) >= 2 and num - stack[-1] == stack[-1] - stack[-2]:
                total_slices += len(stack) - 1
                stack.pop()
            stack.append(num)
        return total_slices
