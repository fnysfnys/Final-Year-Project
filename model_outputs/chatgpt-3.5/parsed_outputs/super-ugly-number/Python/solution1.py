import heapq

class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        A super ugly number is a positive integer whose prime factors are in the array primes.
        Given an integer n and an array of integers primes, return the nth super ugly number.
        The nth super ugly number is guaranteed to fit in a 32-bit signed integer.
        """
        ugly_numbers = [1]
        heap = []
        
        for prime in primes:
            heapq.heappush(heap, (prime, prime, 0))
        
        while len(ugly_numbers) < n:
            next_ugly, prime, index = heapq.heappop(heap)
            if next_ugly > ugly_numbers[-1]:
                ugly_numbers.append(next_ugly)
            heapq.heappush(heap, (prime * ugly_numbers[index], prime, index + 1))
        
        return ugly_numbers[-1]