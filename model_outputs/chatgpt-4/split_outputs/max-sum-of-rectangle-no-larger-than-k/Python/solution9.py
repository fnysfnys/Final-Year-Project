class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        """
        ... [docstring as in the original question] ...
        """
        rows, cols = len(matrix), len(matrix[0])
        max_sum = float('-inf')

        for top in range(rows):
            sums = [0] * cols
            for bottom in range(top, rows):
                for col in range(cols):
                    sums[col] += matrix[bottom][col]
                max_sum = max(max_sum, self.greedyMaxSum(sums, k))
        return max_sum

    def greedyMaxSum(self, nums, k):
        max_sum = float('-inf')
        for start in range(len(nums)):
            sum_val = 0
            for end in range(start, len(nums)):
                sum_val += nums[end]
                if sum_val <= k:
                    max_sum = max(max_sum, sum_val)
        return max_sum
