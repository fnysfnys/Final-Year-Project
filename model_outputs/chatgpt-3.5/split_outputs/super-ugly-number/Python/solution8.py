class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        A super ugly number is a positive integer whose prime factors are in the array primes.
        Given an integer n and an array of integers primes, return the

 nth super ugly number.
        The nth super ugly number is guaranteed to fit in a 32-bit signed integer.
        """
        ugly_numbers = [1]
        prime_indices = [0] * len(primes)
        
        while len(ugly_numbers) < n:
            next_ugly = min(ugly_numbers[prime_indices[j]] * primes[j] for j in range(len(primes)))
            ugly_numbers.append(next_ugly)
            
            for j in range(len(primes)):
                if next_ugly == ugly_numbers[prime_indices[j]] * primes[j]:
                    prime_indices[j] += 1
        
        return ugly_numbers[-1]
