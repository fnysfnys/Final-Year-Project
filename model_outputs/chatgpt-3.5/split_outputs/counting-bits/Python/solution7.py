class Solution(object):
    def countBits(self, n):
        """
        Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
        ...
        """
        def count_ones(num):
            count = 0
            while num > 0:
                count += num & 1
                num >>= 1
            return count

        return [count_ones(i) for i in range(n + 1)]
