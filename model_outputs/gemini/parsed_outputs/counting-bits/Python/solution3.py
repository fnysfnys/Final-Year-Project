class Solution(object):
    def countBits(self, n):
      table = [0] * 256
      for i in range(256):
        table[i] = (i & 1) + table[i // 2]
      ans = [0] * (n + 1)
      for i in range(n + 1):
        ans[i] = table[i & 255] + table[(i >> 8) & 255] + table[(i >> 16) & 255] + table[i >> 24]
      return ans
    
