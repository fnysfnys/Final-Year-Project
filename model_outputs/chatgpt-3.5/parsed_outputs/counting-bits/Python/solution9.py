class Solution(object):
    def countBits(self, n):
        """
        Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
        ...
        """
        result = [0] * (n + 1)
        for i in range(n + 1):
            count = 0
            while i > 0:
                count += i & 1
                i >>= 1
            result[i] = count
        return result