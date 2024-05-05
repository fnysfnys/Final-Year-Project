class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
      factors = [float('inf')] * n
      for p in primes:
        for i in range(n):
          if p * (i + 1) <= n:
            factors[p * (i + 1) - 1] = min(factors[p * (i + 1) - 1], p * (i + 1))
      res = 1
      for _ in range(n - 1):
        res = min(res + 1, min(factors))
        for p in primes:
          factors[p * (res // p) - 1] += p
      return res
    
