class Solution(object):
    def countDigitOne(self, n):
        count = 0
        for i in range(32):
            mask = 1 << i
            ones_before = (n + 1) // (mask * 10) * mask
            ones_current = max(0, (n + 1) % (mask * 10) - mask + 1)
            count += ones_before + ones_current
        return count
