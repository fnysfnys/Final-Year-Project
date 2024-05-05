class Solution:
    def splitArray(self, nums, k):
        def check(x):
            total, groups = 0, 1
            for num in nums:
                if total + num > x:
                    groups += 1
                    total = num
                else:
                    total += num
            return groups <= k

        left, right = max(nums), sum(nums)
        while left < right:
            mid = left + (right - left) // 2
            if check(mid):
                right = mid
            else:
                left = mid + 1
        return left