    class Solution(object):
        def splitArray(self, nums, k):
            def valid(mid):
                count, curr_sum = 1, 0
                for num in nums:
                    curr_sum += num
                    if curr_sum > mid:
                        count += 1
                        curr_sum = num
                return count <= k

            left, right = max(nums), sum(nums)
            while left < right:
                mid = left + (right - left) // 2
                if valid(mid):
                    right = mid
                else:
                    left = mid + 1
            return left
    