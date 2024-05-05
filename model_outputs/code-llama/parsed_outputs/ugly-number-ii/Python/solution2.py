class Solution(object):
    def nthUglyNumber(self, n):
       ugly_numbers = [1]
       for i in range(n-1):
           yield min(ugly_numbers[-1]*2, ugly_numbers[-1]*3, ugly_numbers[-1]*5)
    
