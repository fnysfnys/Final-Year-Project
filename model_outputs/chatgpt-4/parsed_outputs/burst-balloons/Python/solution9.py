class Solution:
    def maxCoins(self, nums):
        """ Use an iterative approach with a stack. """
        nums = [1] + nums + [1]
        stack = [(0, len(nums) - 1)]
        memo = {}
        while stack:
            left, right = stack.pop()
            if (left, right) not in memo:
                if left + 1 == right:
                    memo[(left, right)] = 0
                else:
                    max_coins = 0
                    for i in range(left + 1, right):
                        coins = nums[left] * nums[i] * nums[right]
                        if (left, i) not in memo:
                            stack.append((left, i))
                        if (i, right) not in memo:
                            stack.append((i, right))
                        coins += memo.get((left, i), 0) + memo.get((i, right), 0)
                        max_coins = max(max_coins, coins)
                    memo[(left, right)] = max_coins
        return memo[(0, len(nums) - 1)]