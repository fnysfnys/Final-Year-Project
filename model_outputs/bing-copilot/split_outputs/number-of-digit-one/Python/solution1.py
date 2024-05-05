class Solution(object):
    def countDigitOne(self, n):
        count = 0
        for num in range(n + 1):
            count += str(num).count('1')
        return count
