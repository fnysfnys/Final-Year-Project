class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
       left = 1
       right = n
       while left <= right:
           mid = (left + right) // 2
           if mid * primes[mid % len(primes)] <= n:
               left = mid + 1
           else:
               right = mid - 1
       return left
    
