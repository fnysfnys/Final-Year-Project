class Solution:
    def splitArray(self, nums, k):
        def canSplit(max_sum):
            count, curr_sum = 1, 0
            for num in nums:
                curr_sum += num
                if curr_sum > max_sum:
                    count += 1
                    curr_sum = num
            return count <= k

        prefix_sum = sum(nums)
        left, right = max(nums), prefix_sum
        while left < right:
            mid = (left + right) // 2
            if canSplit(mid):
                right = mid
            else:
                left = mid + 1
        return left
