class Solution(object):
    def maxCoins(self, nums):
        """
        Using a stack.
        Time complexity: O(n^2)
        Space complexity: O(n)
        """
        nums = [1] + nums + [1]
        stack = []
        max_coins = 0

        for num in nums:
            while stack and num > nums[stack[-1]]:
                popped = stack.pop()
                max_coins += nums[popped] * nums[stack[-1]] * num
            stack.append(len(nums) - 1)

        return max_coins
