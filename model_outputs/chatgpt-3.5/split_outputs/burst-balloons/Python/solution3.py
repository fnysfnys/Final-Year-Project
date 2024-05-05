class Solution(object):
    def maxCoins(self, nums):
        """
        Greedy approach.
        Time complexity: O(n^2)
        Space complexity: O(n)
        """
        n = len(nums)
        nums = [1] + nums + [1]
        coins = 0
        
        while n > 0:
            max_val = 0
            max_idx = 0
            for i in range(1, n + 1):
                val = nums[i - 1] * nums[i] * nums[i + 1]
                if val > max_val:
                    max_val = val
                    max_idx = i
            coins += max_val
            del nums[max_idx]
            n -= 1
        
        return coins
