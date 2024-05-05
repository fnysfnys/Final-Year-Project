class Solution(object):
    def generate(self, numRows):
        result = []
        for i in range(1, numRows + 1):
            row = []
            for j in range(0, numRows - i + 1):
                row.append(" ")
            coefficient = 1
            for j in range(1, i + 1):
                row.append(coefficient)
                coefficient = coefficient * (i - j) // j
            result.append(row)
        return result
