class Solution(object):
    def integerReplacement(self, n):
        count = 0
        while n > 1:
            if n & 1 == 0:
                n >>= 1
            else:
                # Check if n+1 has more than one consecutive 1s
                if (n + 1) & (n + 2) == 0:
                    n += 1
                else:
                    n -= 1
            count += 1
        return count
