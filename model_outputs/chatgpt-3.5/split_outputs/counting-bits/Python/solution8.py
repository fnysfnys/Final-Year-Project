class Solution(object):
    def countBits(self, n):
        """
        Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
        ...
        """
        lookup = [0] * (n + 1)
        for i in range(1, n + 1):
            lookup[i] = lookup[i & (i - 1)] + 1
        return lookup
