class Solution(object):
    def nthUglyNumber(self, n):
       ugly_numbers = [1]
       for i in range(n-1):
           ugly_numbers.append(min(ugly_numbers[-1]*2, ugly_numbers[-1]*3, ugly_numbers[-1]*5))
       return ugly_numbers[-1]
    
