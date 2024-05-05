class Solution:
        def generate(self, numRows):
            return [[1 if j == 0 or j == i else (triangle[i - 1][j - 1] + triangle[i - 1][j]) for j in range(i + 1)] for i in range(numRows) for triangle in [self.generate(i)]]