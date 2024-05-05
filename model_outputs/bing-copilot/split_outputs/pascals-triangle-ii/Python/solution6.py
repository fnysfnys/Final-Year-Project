class Solution(object):
    def getRow(self, rowIndex):
        memo = {}

        def helper(i, j):
            if j == 0 or j == i:
                return 1
            if (i, j) in memo:
                return memo[(i, j)]
            memo[(i, j)] = helper(i - 1, j - 1) + helper(i - 1, j)
            return memo[(i, j)]

        return [helper(rowIndex, j) for j in range(rowIndex + 1)]
