class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
       if n == 1:
           return 1
       else:
           return self.nthSuperUglyNumber(n-1, primes) * primes[n % len(primes)]
    
