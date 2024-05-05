class Solution(object):
    def getRow(self, rowIndex):
        """
        [Docstring provided by the user]
        """
        from math import comb
        return [comb(rowIndex, i) for i in range(rowIndex + 1)]
