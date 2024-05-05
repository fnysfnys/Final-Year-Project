class Solution(object):
    def countDigitOne(self, n):
        count = 0
        for i in range(len(str(n))):
            digit = n // 10 ** i % 10
            count += (n // 10 ** (i + 1)) * 10 ** i
            if digit > 1:
                count += 10 ** i
            elif digit == 1:
                count += n % 10 ** i + 1
        return count
