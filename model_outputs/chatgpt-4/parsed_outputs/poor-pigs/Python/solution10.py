class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        for pigs in range(buckets):
            if (minutesToTest // minutesToDie + 1) ** pigs >= buckets:
                return pigs
        return buckets