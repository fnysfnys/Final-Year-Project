class Solution(object):
    def countBits(self, n):
      if n == 0:
        return [0]
      ans = self.countBits(n // 2)
      for i in range(n // 2 + 1, n + 1):
        ans.append(1 + ans[i - n // 2 - 1])
      return ans
    
