class Solution(object):


    def integerReplacement(self, n):
        # Docstring here

        count = 0
        while n > 1:
            if (n & 1) == 0:
                n >>= 1
            else:
                n = (n - 1) if ((n - 1) & 2) == 0 or n == 3 else (n + 1)
            count += 1
        return count
