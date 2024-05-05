class Solution(object):
    def countDigitOne(self, n):
        """
        Given an integer n, count the total number of digit 1 appearing in all non-negative integers

 less than or equal to n.
         
        Example 1:
        
        Input: n = 13
        Output: 6
        
        Example 2:
        
        Input: n = 0
        Output: 0
        
         
        Constraints:
        
        0 <= n <= 109
        
        :type n: int
        :rtype: int
        """
        count = 0
        for i in range(n + 1):
            digit_count = {}
            for digit in str(i):
                if digit in digit_count:
                    digit_count[digit] += 1
                else:
                    digit_count[digit] = 1
            count += digit_count.get('1', 0)
        return count