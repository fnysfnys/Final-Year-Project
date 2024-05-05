class Solution(object):
    def getRow(self, rowIndex):
        row = [1] + [0] * rowIndex
        for i in range(rowIndex):
            for j in range(i + 1, 0, -1):
                row[j] += row[j - 1]
        return row
