class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        [Same docstring as provided]
        """
        def backtrack(path, length):
            if length == 0:
                return 1
            total = 0
            for i in range(10):
                if i not in path:
                    path.add(i)
                    total += backtrack(path, length - 1)
                    path.remove(i)
            return total

        return sum(backtrack(set(), i) for i in range(n + 1))

