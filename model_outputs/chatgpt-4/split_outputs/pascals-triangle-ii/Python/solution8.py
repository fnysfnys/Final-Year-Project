class Solution(object):
    def getRow(self, rowIndex):
        """
        [Docstring provided by the user]
        """
        row = [1]
        for i in range(1, rowIndex + 1):
            row = [1] + [row[j] + row[j + 1] for j in range(i - 1)] + [1]
        return row
