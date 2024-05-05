def nthUglyNumber(n):
   if n == 1:
       return 1
   else:
       return min(nthUglyNumber(n-1)*2, nthUglyNumber(n-1)*3, nthUglyNumber(n-1)*5)
