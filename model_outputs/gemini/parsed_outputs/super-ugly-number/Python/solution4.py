class Solution(object):
    def nthSuperUglyNumber(self, n, primes, i=0, num=1):
      if i == n: return num
      next_nums = [num * p for p in primes]
      return min(self.nthSuperUglyNumber(n, primes, i + 1, n) for n in next_nums if n > num)
    
