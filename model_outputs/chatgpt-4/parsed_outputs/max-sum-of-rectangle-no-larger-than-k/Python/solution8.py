class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        """
        ... [docstring as in the original question] ...
        """
        rows, cols = len(matrix), len(matrix[0])
        max_sum = float('-inf')

        for left in range(cols):
            row_sums = [0] * rows
            for right in range(left, cols):
                for i in range(rows):
                    row_sums[i] += matrix[i][right]
                max_sum = max(max_sum, self.maxSubArrayWithSumNoLargerThanK(row_sums, k))
        return max_sum

    def maxSubArrayWithSumNoLargerThanK(self, nums, k):
        max_sum = float('-inf')
        cum_sum = 0
        sums = []
        for num in nums:
            bisect.insort(sums, cum_sum)
            cum_sum += num
            i = bisect.bisect_left(sums, cum_sum - k)
            if i != len(sums):
                max_sum = max(max_sum, cum_sum - sums[i])
        return max_sum