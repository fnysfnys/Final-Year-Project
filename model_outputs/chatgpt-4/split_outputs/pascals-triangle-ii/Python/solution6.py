class Solution(object):
    def getRow(self, rowIndex):
        """
        [Docstring provided by the user]
        """
        row = [1]
        for _ in range(1, rowIndex + 1):
            row.append(row[-1] * (rowIndex - _ + 1) // _)
        return row
