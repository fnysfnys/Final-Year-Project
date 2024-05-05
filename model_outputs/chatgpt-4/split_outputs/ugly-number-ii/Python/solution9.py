class Solution(object):
    def nthUglyNumber(self, n):
        """
        (docstring as provided)
        """
        def is_ugly(num):
            for p in [2, 3, 5]:
                while num % p == 0:
                    num //= p
            return num == 1

        left, right = 1, n * 5
        while left < right:
            mid = (left + right) // 2
            count = sum(mid // i for i in [2, 3, 5])
            if count < n:
                left = mid + 1
            else:
                right = mid
        return left
