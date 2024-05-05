import heapq

class CustomPriorityQueue(object):
    def __init__(self):
        self.queue = []
        self.set = set()
    
    def push(self, value):
        if value not in self.set:
            heapq.heappush(self.queue, value)
            self.set.add(value)
    
    def pop(self):
        value = heapq.heappop(self.queue)
        self.set.remove(value)
        return value

class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        A super ugly number is a positive integer whose prime factors are in the array primes.
        Given an integer n and an array of integers primes, return the nth super ugly number.
        The nth super ugly number is guaranteed to fit in a 32-bit signed integer.
        """
        ugly_numbers = [1]
        prime_queues = [CustomPriorityQueue() for _ in primes]
        
        for i, prime in enumerate(primes):
            prime_queues[i].push(prime)
        
        while len(ugly_numbers) < n:
            next_ugly = min(prime_queues[i].pop() * primes[i] for i in range(len(primes)))
            ugly_numbers.append(next_ugly)
            
            for i, prime in enumerate(primes):
                if next_ugly % prime == 0:
                    prime_queues[i].push(next_ugly // prime)
        
        return ugly_numbers[-1]
