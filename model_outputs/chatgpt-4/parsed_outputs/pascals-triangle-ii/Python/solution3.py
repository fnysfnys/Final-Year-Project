class Solution(object):
    def getRow(self, rowIndex):
        """
        [Docstring provided by the user]
        """
        if rowIndex == 0:
            return [1]
        elif rowIndex == 1:
            return [1, 1]
        else:
            prev_row = self.getRow(rowIndex - 1)
            return [1] + [prev_row[i] + prev_row[i + 1] for i in range(len(prev_row) - 1)] + [1]