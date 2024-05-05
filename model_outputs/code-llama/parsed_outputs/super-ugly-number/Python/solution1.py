class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
       result = 1
       for i in range(n):
           result *= primes[i % len(primes)]
       return result
    
