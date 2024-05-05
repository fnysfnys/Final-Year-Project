class Solution(object):
    def integerReplacement(self, n):
        count = 0
        while n > 1:
            if n % 2 == 0:
                n //= 2
            elif n == 3 or (n & 2 == 0):
                n -= 1
            else:
                n += 1
            count += 1
        return count
