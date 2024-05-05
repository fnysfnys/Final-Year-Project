class Solution:
    def maxCoins(self, nums):
        """ Implement the algorithm using a recursive approach. """
        nums = [1] + nums + [1]
        
        def burst(left, right):
            if left + 1 == right:
                return 0
            best = 0
            for i in range(left + 1, right):
                coins = nums[left] * nums[i] * nums[right]
                coins += burst(left, i) + burst(i, right)
                best = max(best, coins)
            return best

        return burst(0, len(nums) - 1)
