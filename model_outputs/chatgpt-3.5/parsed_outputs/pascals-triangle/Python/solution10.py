from collections import deque

class Solution(object):
    def generate(self, numRows):
        """
        Given an integer numRows, return the first numRows of Pascal's triangle.
        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown.
        
        Example 1:
        Input: numRows = 5
        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        Example 2:
        Input: numRows = 1
        Output: [[1]]
        
        Constraints:
        1 <= numRows <= 30
        
        :type numRows: int
        :rtype: List[List[int]]
        """
        triangle = []
        for i in range(numRows):
            row = deque([1])
            if i > 0:
                for j in range(1, i):
                    row.append(row[-1] + triangle[i-1][j])
                row.append(1)
            triangle.append(list(row))
        return triangle