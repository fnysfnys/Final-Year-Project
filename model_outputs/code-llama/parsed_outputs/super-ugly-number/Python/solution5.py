class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
       memo = {}
       def helper(n, primes):
           if n in memo:
               return memo[n]
           else:
               result = helper(n-1, primes) * primes[n % len(primes)]
               memo[n] = result
               return result
       return helper(n, primes)
    
