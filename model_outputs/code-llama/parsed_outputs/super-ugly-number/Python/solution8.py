class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
       hash_table = {}
       for i in range(n):
           hash_table[i] = 1
       for i in range(n):
           for j in range(i):
               hash_table[i] = max(hash_table[i], hash_table[j] * primes[i % len(primes)])
       return hash_table[n]
    
