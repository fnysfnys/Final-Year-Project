class Solution(object):
    def integerReplacement(self, n):
        """
        Given a positive integer n, you can apply one of the following operations:

        If n is even, replace n with n / 2.
        If n is odd, replace n with either n + 1 or n - 1.

        Return the minimum number of operations needed for n to become 1.

        :type n: int
        :rtype: int
        """
        if n == 1:
            return 0
        
        left, right = 1, n
        while left < right:
            mid = left + (right - left) // 2
            if mid % 2 == 0:
                left = mid + 1
            else:
                right = mid


        return 1 + min(self.integerReplacement(left), self.integerReplacement(left - 2))