class Solution(object):
    def countDigitOne(self, n):
        lookup = [0] * 10
        for i in range(10):
            lookup[i] = lookup[i - 1] + 10 ** (i - 1)
        count = 0
        for i, digit in enumerate(str(n)[::-1]):
            count += int(digit) * lookup[i] + (n % 10 ** i + 1) if digit == '1' else 0
        return count
