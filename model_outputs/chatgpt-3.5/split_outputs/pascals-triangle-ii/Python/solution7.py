class Solution(object):
    def getRow(self, rowIndex):
        """
        Given an integer rowIndex, return the rowIndexth (0-indexed) row of Pascal's triangle

.
        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown.

        Example 1:
        Input: rowIndex = 3
        Output: [1,3,3,1]

        Example 2:
        Input: rowIndex = 0
        Output: [1]

        Example 3:
        Input: rowIndex = 1
        Output: [1,1]

        Constraints:
        0 <= rowIndex <= 33

        Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?

        :type rowIndex: int
        :rtype: List[int]
        """
        row = [0] * (rowIndex + 1)
        row[0] = 1
        
        for i in range(1, rowIndex + 1):
            for j in range(i, 0, -1):
                row[j] += row[j - 1]
        
        return row
