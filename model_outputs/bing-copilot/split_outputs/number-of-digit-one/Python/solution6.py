class Solution(object):
    def countDigitOne(self, n):
        return sum(str(num).count('1') for num in range(n + 1))
