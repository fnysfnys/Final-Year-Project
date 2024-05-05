class Solution(object):
    def integerReplacement(self, n, count=0):
        if n == 1:
            return count
        if n % 2 == 0:
            return self.integerReplacement(n // 2, count + 1)
        else:
            return min(self.integerReplacement(n + 1, count + 1), self.integerReplacement(n - 1, count + 1))
