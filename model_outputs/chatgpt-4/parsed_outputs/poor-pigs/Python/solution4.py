class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        left, right = 0, buckets
        while left < right:
            mid = left + (right - left) // 2
            if (minutesToTest // minutesToDie + 1) ** mid < buckets:
                left = mid + 1
            else:
                right = mid
        return left