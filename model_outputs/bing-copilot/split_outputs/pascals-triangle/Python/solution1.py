class Solution(object):
    def generate(self, numRows):
        result = []
        for i in range(numRows):
            row = []
            for j in range(numRows - i + 1):
                row.append(" ")  # Add spaces for left alignment
            for j in range(i + 1):
                coefficient = factorial(i) // (factorial(j) * factorial(i - j))
                row.append(coefficient)
            result.append(row)
        return result
