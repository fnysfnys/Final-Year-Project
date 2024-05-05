class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        [Same docstring as provided]
        """
        from itertools import combinations

        def count_combinations(n):
            return sum(len(set(combinations(range(10), i)))

for i in range(n + 1))

        return count_combinations(n)