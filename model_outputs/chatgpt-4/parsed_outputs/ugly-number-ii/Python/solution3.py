class Solution(object):
    def nthUglyNumber(self, n):
        """
        (docstring as provided)
        """
        ugly = sorted(1 for _ in range(n))
        seen = set(ugly)
        factors = [2, 3, 5]

        for i in range(1, n):
            for factor in factors:
                new_ugly = ugly[i - 1] * factor
                if new_ugly not in seen:
                    seen.add(new_ugly)
                    ugly.append(new_ugly)
            ugly.sort()

        return ugly[n - 1]