class Solution(object):
    def integerReplacement(self, n):
        memo = {}
        def helper(num):
            if num == 1:
                return 0
            if num in memo:
                return memo[num]
            if num % 2 == 0:
                memo[num] = 1 + helper(num // 2)
            else:
                memo[num] = 1 + min(helper(num + 1), helper(num - 1))
            return memo[num]
        return helper(n)
