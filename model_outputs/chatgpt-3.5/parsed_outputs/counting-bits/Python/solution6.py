class Solution(object):
    def countBits(self, n):
        """
        Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
        ...
        """
        if n == 0:
            return [0]
        bits = self.countBits(n - 1)
        return bits + [bits[i] + 1 for i in range(n % 2, n + 1)]