class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        A super ugly number is a positive integer whose prime factors are in the array primes.
        Given an integer n and an array of integers primes, return the nth super ugly number.
        The nth super ugly number is guaranteed to fit in a 32-bit signed integer.
        """
        def find_next_ugly_number(ugly_numbers, primes):
            min_ugly = float('inf')
            for prime in primes:
                for ugly in ugly_numbers:
                    if ugly * prime > ugly_numbers[-1]:
                        min_ugly = min(min_ugly, ugly * prime)
            return min_ugly
        
        ugly_numbers = [1]
        
        while len(ugly_numbers) < n:
            next_ugly = find_next_ugly_number(ugly_numbers, primes)
            ugly_numbers.append(next_ugly)
        
        return ugly_numbers[-1]
