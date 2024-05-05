class Solution(object):
    def nthUglyNumber(self, n):
       if n == 1:
           return 1
       else:
           return min(self.nthUglyNumber(n-1)*2, self.nthUglyNumber(n-1)*3, self.nthUglyNumber(n-1)*5)
    
