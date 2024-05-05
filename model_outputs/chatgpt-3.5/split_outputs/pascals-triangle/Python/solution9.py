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
        def generate_row(row):
            yield 1
            for i in range(len(row) - 1):
                yield row[i] + row[i + 1]
            yield 1
        
        def generate_triangle(num_rows, triangle):
            if num_rows == 0:
                return triangle
            else:
                prev_row = triangle[-1] if triangle else []
                new_row = list(generate_row(prev_row))
                triangle.append(new_row)
                return generate_triangle(num_rows - 1, triangle)
        
        return generate_triangle(numRows, [])
