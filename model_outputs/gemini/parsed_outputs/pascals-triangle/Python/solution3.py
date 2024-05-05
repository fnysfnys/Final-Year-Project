class Solution(object):
    def generate(self, numRows):
        if numRows == 0:
            return []
        elif numRows == 1:
            return [[1]]
        else:
            previous = self.generate(numRows - 1)
            row = [1] + [previous[-1][i] + previous[-1][i + 1] for i in range(numRows - 2)] + [1]
            return previous + [row]
    
