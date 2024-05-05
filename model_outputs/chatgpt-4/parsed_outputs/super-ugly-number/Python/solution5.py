class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        ... [Docstring as above] ...
        """
        uglies = set([1])
        for _ in range(n - 1):
            next_ugly = min(uglies)
            uglies.remove(next_ugly)
            for prime in primes:
                uglies.add(next_ugly * prime)

        return min(uglies)