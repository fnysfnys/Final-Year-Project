class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        """
        ... [docstring as in the original question] ...
        """
        def maxSumSubarray(arr):
            max_sum = float('-inf')
            curr_sum = 0
            for num in arr:
                curr_sum = max(num, curr_sum + num)
                max_sum = max(max_sum, curr_sum)
            return max_sum

        rows, cols = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for top in range(rows):
            temp = [0] * cols
            for bottom in range(top, rows):
                for i in range(cols):
                    temp[i] += matrix[bottom][i]
                max_sum = max(max_sum, maxSumSubarray(temp))
        return max_sum if max_sum <= k else k
