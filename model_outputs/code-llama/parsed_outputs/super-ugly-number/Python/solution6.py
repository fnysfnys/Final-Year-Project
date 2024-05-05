class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
       dp = [1] * (n+1)
       for i in range(2, n+1):
           for j in range(i):
               dp[i] = max(dp[i], dp[j] * primes[i % len(primes)])
       return dp[n]
    
