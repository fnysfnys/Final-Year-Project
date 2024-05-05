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
                max_sum = max(max_sum, self.maxSubArrayLessThanK(sums, k))
        return max_sum

    def maxSubArrayLessThanK(self, nums, k):
        max_sum = float('-inf')
        cum_sum = 0
        sums = [float('inf')]
        for num in nums:
            bisect.insort(sums, cum_sum)
            cum_sum += num
            i = bisect.bisect_left(sums, cum_sum - k)
            if i < len(sums):
                max_sum = max(max_sum, cum_sum - sums[i])
        return max_sum