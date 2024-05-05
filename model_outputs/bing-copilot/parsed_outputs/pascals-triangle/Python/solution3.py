class Solution(object):
    def generate(self, numRows):
        result = []
        for i in range(numRows):
            row = " " * (numRows - i)
            row += " ".join(map(str, str(11 ** i)))
            result.append(row)
        return result
