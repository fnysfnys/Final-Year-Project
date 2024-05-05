class Solution(object):
    def integerBreak(self, n):
        memo = {}
        def helper(num):
            if num in memo:
                return memo[num]
            if num <= 3:
                return num - 1
            max_product = 0
            for i in range(1, num):
                max_product = max(max_product, i * max(num - i, helper(num - i)))
            memo[num] = max_product
            return max_product
        return helper(n)
