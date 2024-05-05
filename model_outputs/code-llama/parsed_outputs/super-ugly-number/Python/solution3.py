class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
       return (result * primes[i % len(primes)] for i in range(n))
    
