class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        ... [Docstring as above] ...
        """
        ugly_numbers = [1]
        seen = set(ugly_numbers)

        for _ in range(n - 1):
            next_uglies = [ugly * prime for ugly in ugly_numbers for prime in primes if ugly * prime not in seen]
            next_ugly = min(next_uglies)
            ugly_numbers.append(next_ugly)
            seen.add(next_ugly)

        return ugly_numbers[-1]
