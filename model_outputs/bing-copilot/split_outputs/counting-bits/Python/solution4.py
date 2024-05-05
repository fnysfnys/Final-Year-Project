class Solution(object):
    def countBits(self, n):
        def hamming_weight(x):
            return bin(x).count('1')
        ans = [hamming_weight(i) for i in range(n + 1)]
        return ans
