class Solution(object):
    def getRow(self, rowIndex):
        """
        [Docstring provided by the user]
        """
        from functools import reduce
        return list(reduce(lambda row, _: [1] + [row[i] + row[i + 1] for i in range(len(row) - 1)] + [1], range(rowIndex), [1]))
