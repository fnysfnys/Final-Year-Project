class Solution(object):
    def getRow(self, rowIndex):
        row = [1]
        for i in range(1, rowIndex // 2 + 1):
            row.append(row[-1] * (rowIndex - i + 1) // i)
        return row + row[::-1] if rowIndex % 2 == 0 else row + row[-2::-1]
