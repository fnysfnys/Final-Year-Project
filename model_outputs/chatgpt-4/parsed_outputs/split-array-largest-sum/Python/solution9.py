class Solution:
    def splitArray(self, nums, k):
        def isPossible(limit):
            count, total = 1, 0
            for num in nums:
                if total + num > limit:
                    total = num
                    count += 1
                else:
                    total += num
            return count <= k

        low, high = max(nums), sum(nums)
        while low < high:
            mid = (low + high) // 2
            if isPossible(mid):
                high = mid
            else:
                low = mid + 1
        return low