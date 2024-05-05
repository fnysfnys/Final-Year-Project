class Solution(object):
    def countBits(self, n):
        def popcount(x):
            return bin(x).count('1')
        ans = [popcount(i) for i in range(n + 1)]
        return ans
