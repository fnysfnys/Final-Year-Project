class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
        
        Example 1:
        Input: n = 2
        Output: 91
        Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100, excluding 11,22,33,44,55,66,77,88,99
        
        Example 2:
        Input: n = 0
        Output: 1
        
        Constraints:
        0 <= n <= 8
        
        :type n: int
        :rtype: int
        """
        memo = {0: 1, 1: 10}
        def count_unique_digits(num_digits):
            if num_digits in memo:
                return memo[num_digits]
            result = (10 - num_digits + 1) * count_unique_digits(num_digits - 1)
            memo[num_digits] = result
            return result
        return count_unique_digits(n) + self.countNumbersWithUniqueDigits(n - 1)
