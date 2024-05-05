class Solution:
    def splitArray(self, nums, k):
        def canSplit(maxSum):
            curSum, splits = 0, 0
            for num in nums:
                if curSum + num > maxSum:
                    curSum = num
                    splits += 1
                else:
                    curSum += num
            return splits + 1 <= k

        left, right = max(nums), sum(nums)
        while left < right:
            mid = left + (right - left) // 2
            if canSplit(mid):
                right = mid
            else:
                left = mid + 1
        return left