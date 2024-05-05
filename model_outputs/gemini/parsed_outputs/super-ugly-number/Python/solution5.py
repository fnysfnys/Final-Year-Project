class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
      def backtrack(i, num):
        if i == n: return [num]
        res = []
        for p in primes:
          if num * p > res[-1] if res else True:
            res.extend(backtrack(i + 1, num * p))
        return res
      return min(res)[0] for res in backtrack(0, 1))[-1]
    
