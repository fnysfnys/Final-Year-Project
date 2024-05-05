from functools import lru_cache

class Solution(object):
    def nthUglyNumber(self, n):
        """
        (docstring as provided)
        """
        @lru_cache(maxsize=None)
        def compute_ugly(k):
            if k == 1: return 1
            return min(compute_ugly(k // 2) * 2, compute_ugly(k // 3) * 3, compute_ugly(k // 5) * 5)

        result = 1
        for i in range(2, n + 1):
            result = compute_ugly(i)
        return result