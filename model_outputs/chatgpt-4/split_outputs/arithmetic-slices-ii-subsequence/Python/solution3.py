from itertools import combinations

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        [Docstring from the provided code snippet]
        """
        def is_arithmetic(sub):
            return all(sub[i] - sub[i - 1] == sub[1] - sub[0] for i in range(2, len(sub)))

        return sum(is_arithmetic(comb) for comb in combinations(nums, 3))
