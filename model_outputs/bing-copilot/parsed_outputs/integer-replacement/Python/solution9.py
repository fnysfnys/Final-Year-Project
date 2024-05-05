class Solution(object):
    def integerReplacement(self, n):
        memo = set()
        def helper(num):
            if num == 1:
                return 0
            if num in memo:
                return float('inf')
            if num % 2 == 0:
                memo.add(num)
                return 1 + helper(num // 2)
            else:
                memo.add(num)
                return 1 + min(helper(num + 1), helper(num - 1))
        return helper(n)
