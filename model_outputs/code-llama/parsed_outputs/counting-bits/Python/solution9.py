class Solution(object):
    def countBits(self, n):
       return [1 + self.countBits(n-1) for i in range(n)]
    
