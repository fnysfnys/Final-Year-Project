class Solution:
    def poorPigs(self, buckets, minutesToDie, minutesToTest):
        pigs = 0
        while (1 + minutesToTest // minutesToDie) ** pigs < buckets:
            pigs += 1
        return pigs