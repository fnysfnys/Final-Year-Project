class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        """
        ... [docstring as in the original question] ...
        """
        rows, cols = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for left in range(cols):
            sums = [0] * rows
            for right in range(left, cols):
                for i in range(rows):
                    sums[i] += matrix[i][right]
                # Find the max subarray no more than K
                max_sum = max(max_sum, self.maxSubArray(sums, k))
        return max_sum

    def maxSubArray(self, nums, k):
        max_sum, cum_sum = float('-inf'), 0
        sums = [float('inf')]
        for num in nums:
            bisect.insort(sums, cum_sum)
            cum_sum += num
            i = bisect.bisect_left(sums, cum_sum - k)
            if i < len(sums):
                max_sum = max(max_sum, cum_sum - sums[i])
        return max_sum