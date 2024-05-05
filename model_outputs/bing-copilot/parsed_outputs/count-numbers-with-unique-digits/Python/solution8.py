from itertools import permutations

class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        if n == 0:
            return 1
        total_count = 10
        for i in range(2, n + 1):
            unique_digits = 9
            for j in range(1, i):
                unique_digits *= (10 - j)
            total_count += len(set(permutations(range(10), i))) - unique_digits
        return total_count
