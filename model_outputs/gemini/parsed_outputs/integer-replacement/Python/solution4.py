class Solution(object):
    def integerReplacement(self, n):
        LUT = {1: 0, 2: 1}
        while n not in LUT:
            if n % 2 == 0:
                LUT[n] = 1 + LUT[n // 2]
            else:
                LUT[n] = 1 + min(LUT[n + 1], LUT[n - 1])
            n = min(n + 1, n - 1) if n % 2 else n // 2
        return LUT[n]
