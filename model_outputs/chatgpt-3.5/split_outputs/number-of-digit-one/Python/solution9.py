import itertools

class Solution(object):
    def countDigitOne(self, n):
        """
        Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
         
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
        def count_ones(x):
            return str(x).count('1')
        
        count = sum(itertools.starmap(count_ones, enumerate(range(n + 1))))
        return count
