class Solution(object):
    def integerReplacement(self, n):
        count = 0
        while n > 1:
            if n & 1:
                if n & 2 and n != 3:
                    n += 1
                else:
                    n -= 1
            else:
                n >>= 1
            count += 1
        return count
