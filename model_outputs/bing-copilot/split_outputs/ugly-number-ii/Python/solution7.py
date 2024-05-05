class Solution(object):
    def nthUglyNumber(self, n):
        def find_ugly(num, count):
            if count == n:
                return num
            next_ugly = min(num * 2, num * 3, num * 5)
            return find_ugly(next_ugly, count + 1)

        return find_ugly(1, 1)
