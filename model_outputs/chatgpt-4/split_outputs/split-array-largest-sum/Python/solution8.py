class Solution:
    def splitArray(self, nums, k):
        n = len(nums)
        left, right = max(nums), sum(nums)
        result = right
        while left <= right:
            mid = (left + right) // 2
            sum, count = 0, 1
            for i in range(n):
                if sum + nums[i] > mid:
                    sum = nums[i]
                    count += 1
                else:
                    sum += nums[i]
            if count <= k:
                result = mid
                right = mid - 1
            else:
                left = mid + 1
        return result
