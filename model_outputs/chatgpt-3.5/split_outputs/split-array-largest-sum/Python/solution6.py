class Solution(object):
    def splitArray(self, nums, k):
        """
        Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
        Return the minimized largest sum of the split.
        A subarray is a contiguous part of the array.
        """
        left, right = max(nums), sum(nums)
        while left < right:
            mid = (left + right) // 2
            count = 1
            current_sum = 0
            for num in nums:
                if current_sum + num > mid:
                    count += 1
                    current_sum = 0
                current_sum += num
            if count <= k:
                right = mid
            else:
                left = mid + 1
        return left
