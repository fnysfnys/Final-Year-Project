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
        if n == 0:
            return 1
        count = 10
        unique_digits = 9
        available_digits = 9
        count += sum(unique_digits * available_digits for i in range(2, n + 1))
        return count