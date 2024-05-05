class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        ... [Docstring as above] ...
        """
        ugly_numbers = [1] + [0] * (n - 1)
        pointers = [0] * len(primes)
        
        for i in range(1, n):
            min_val = min(primes[j] * ugly_numbers[pointers[j]] for j in range(len(primes)))
            ugly_numbers[i] = min_val
            
            for j in range(len(primes)):
                if primes[j] * ugly_numbers[pointers[j]] == min_val:
                    pointers[j] += 1
        
        return ugly_numbers[-1]
