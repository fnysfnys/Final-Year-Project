class Solution:
    def splitArray(self, nums, k):
        def isValid(mid):
            count, sum = 1, 0
            for num in nums:
                if sum + num > mid:
                    count += 1
                    sum = num
                else:
                    sum += num
            return count <= k

        left, right = max(nums), sum(nums)
        while left < right:
            mid = (left + right) // 2
            if isValid(mid):
                right = mid
            else:
                left = mid + 1
        return left
