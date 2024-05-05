class Solution(object):
    def getRow(self, rowIndex):
        """
        [Docstring provided by the user]
        """
        from functools import lru_cache
        @lru_cache(maxsize=None)
        def build_row(row):
            if row == 0:
                return [1]
            elif row == 1:
                return [1, 1]
            prev = build_row(row - 1)
            return [1] + [prev[i] + prev[i + 1] for i in range(len(prev) - 1)] + [1]

        return build_row(rowIndex)