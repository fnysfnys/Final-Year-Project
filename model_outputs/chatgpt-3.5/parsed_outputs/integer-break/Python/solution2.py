class Solution(object):
    def integerBreak(self, n):
        """
        Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
        Return the maximum product you can get.
        
        Example 1:
        Input: n = 2
        Output: 1
        Explanation: 2 = 1 + 1, 1 × 1 = 1.
        
        Example 2:
        Input: n = 10
        Output: 36
        Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
        
        Constraints:
        2 <= n <= 58
        
        :type n: int
        :rtype: int
        """
        if n <= 2:
            return 1
        max_product = 0
        for i in range(2, n + 1):
            max_product = max(max_product, self.integerBreak(n - i) * i, (n - i) * i)
        return max_product