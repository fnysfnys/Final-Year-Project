class Solution(object):
    def integerReplacement(self, n):
        # Docstring here

        def tail_rec(n, acc):
            if n == 1:
                return acc
            elif n % 2 == 0:
                return tail_rec(n // 2, acc + 1)
            else:
                return min(tail_rec(n + 1, acc + 1), tail_rec(n - 1, acc + 1))

        return tail_rec(n, 0)