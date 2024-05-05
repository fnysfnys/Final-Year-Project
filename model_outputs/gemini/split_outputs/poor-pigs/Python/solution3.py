class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        if buckets == 1:
            return 0
        if minutesToTest <= minutesToDie:
            return -1
        
        l, r = 1, buckets
        while l < r:
            mid = (l + r) // 2
            maxTests = (minutesToTest // minutesToDie) ** mid
            if maxTests >= buckets:
                l = mid + 1
            else:
                r = mid
        
        return l
